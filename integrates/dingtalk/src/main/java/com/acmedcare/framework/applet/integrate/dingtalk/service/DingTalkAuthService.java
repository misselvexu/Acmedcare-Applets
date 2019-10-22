package com.acmedcare.framework.applet.integrate.dingtalk.service;

import com.acmedcare.framework.applet.api.bean.Principal;
import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.api.exception.InvalidRequestParamException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import com.acmedcare.framework.applet.integrate.dingtalk.DingTalkAppletContext;
import com.acmedcare.framework.applet.integrate.dingtalk.bean.DingTalkPrincipal;
import com.acmedcare.framework.applet.integrate.dingtalk.repository.DingTalkRepository;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;
import com.acmedcare.framework.kits.BeanUtils;
import com.acmedcare.framework.kits.executor.AsyncRuntimeExecutor;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.DingTalkSignatureUtil;
import com.dingtalk.api.request.OapiServiceGetCorpTokenRequest;
import com.dingtalk.api.request.OapiUserGetRequest;
import com.dingtalk.api.request.OapiUserGetuserinfoRequest;
import com.dingtalk.api.response.OapiServiceGetCorpTokenResponse;
import com.dingtalk.api.response.OapiUserGetResponse;
import com.dingtalk.api.response.OapiUserGetuserinfoResponse;
import com.taobao.api.ApiException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import static com.acmedcare.framework.applet.integrate.dingtalk.DingTalkAppletContext.context;
import static com.acmedcare.framework.applet.integrate.dingtalk.DingTalkExtensionDefined.DING_TALK;
import static com.acmedcare.framework.applet.integrate.dingtalk.contants.DingTalkConstants.*;

/**
 * {@link DingTalkAuthService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Extension(DING_TALK)
public class DingTalkAuthService implements AuthService {

  private static final Logger log = LoggerFactory.getLogger(DingTalkAuthService.class);

  /**
   * Applet Auth Method
   *
   * <p>Current Type Support : Alibaba DingTalk Applet.
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public AppletResponse auth(HttpServletRequest request) throws AppletException {

    String corpId = request.getParameter("corpId");
    String authCode = request.getParameter("authCode");

    if (StringUtils.isAnyBlank(corpId, authCode)) {
      throw new InvalidRequestParamException(
          "DingTalk's auth request param [corpId,authCode] must not be null or blank.");
    }

    // 获取accessToken,注意正是代码要有异常流处理
    OapiServiceGetCorpTokenResponse oapiServiceGetCorpTokenResponse = getOapiServiceGetCorpToken(corpId);

    String accessToken = oapiServiceGetCorpTokenResponse.getAccessToken();

    // 获取用户信息
    OapiUserGetuserinfoResponse oapiUserGetuserinfoResponse = getOapiUserGetuserinfo(accessToken, authCode);

    Assert.notNull(oapiUserGetuserinfoResponse, "[==DingTalk==] get user info response must not be null.");

    // 3.查询得到当前用户的userId
    // 获得到userId之后应用应该处理应用自身的登录会话管理（session）,避免后续的业务交互（前端到应用服务端）每次都要重新获取用户身份，提升用户体验
    String userId = oapiUserGetuserinfoResponse.getUserid();

    // 4.查询用户信息
    OapiUserGetResponse oapiUserGetResponse = getOapiUserGet(accessToken,userId);
    Assert.notNull(oapiUserGetResponse,"[==DingTalk==] get user detail response must not be null.");
    DingTalkPrincipal principal = new DingTalkPrincipal();
    BeanUtils.copyProperties(oapiUserGetResponse,principal);

    // 5.查询绑定的信息
    try{
      DingTalkPrincipal dingTalkPrincipal = queryPrincipal(userId);
      if (dingTalkPrincipal != null) {
        principal.setBasePlatformPrincipalId(dingTalkPrincipal.getBasePlatformPrincipalId());
        principal.setBasePlatformPrincipalToken(dingTalkPrincipal.getBasePlatformPrincipalToken());
      }
    } catch (Exception e) {
      log.warn("==Applets DingTalk== query dingtalk principal failed", e);
    }

    Map<String, Object> resultMap = new HashMap<>(4);
    resultMap.put("userId", userId);
    resultMap.put("corpId", corpId);
    resultMap.put("token", accessToken);
    resultMap.put("principal",principal);

    // save
    AsyncRuntimeExecutor.getAsyncThreadPool().execute(() -> savePrincipal(principal.getUserid(),principal));

    return AppletResponse.appletResponseBuilder().data(resultMap).appletResponseBuild();
  }

  private void savePrincipal(String thirdPlatformId, Principal principal) {

    try {
      AppletAuthModel.AppletAuthModelKey key =
          AppletAuthModel.AppletAuthModelKey.builder()
              .thirdPlatformId(thirdPlatformId)
              .thirdPlatformType(DING_TALK)
              .build();

      DingTalkRepository repository =
          (DingTalkRepository) AppletsSPIExtensionFactory.getRepository(DING_TALK, AppletsRepository.class);

      repository.savePrincipal(key,principal);

    } catch (Exception e) {
      log.warn("==Applets DingTalk== save dingtalk principal failed", e);
    }
  }

  private DingTalkPrincipal queryPrincipal(String userId) throws AppletException {

    try{
      AppletAuthModel.AppletAuthModelKey key =
          AppletAuthModel.AppletAuthModelKey.builder()
              .thirdPlatformId(userId)
              .thirdPlatformType(DING_TALK)
              .build();

      DingTalkRepository repository =
          (DingTalkRepository) AppletsSPIExtensionFactory.getRepository(DING_TALK, AppletsRepository.class);

      DingTalkPrincipal value = repository.queryPrincipal(key, DingTalkPrincipal.class);

      log.info("==Applets DingTalk== query dingtalk principal result : {}", value);

      return value;

    } catch (Exception e) {
      log.warn("==Applets DingTalk== query dingtalk principal failed", e);
      return null;
    }
  }

  /**
   * ISV获取企业访问凭证
   *
   * @param corpId 授权企业的corpId
   */
  private OapiServiceGetCorpTokenResponse getOapiServiceGetCorpToken(String corpId) {
    if (corpId == null || corpId.isEmpty()) {
      return null;
    }

    long timestamp = System.currentTimeMillis();
    // 正式应用应该由钉钉通过开发者的回调地址动态获取到
    String suiteTicket = getSuiteTicket(context().getProperties().getSuiteKey());
    String signature =
        DingTalkSignatureUtil.computeSignature(
            context().getProperties().getSuiteSecret(),
            DingTalkSignatureUtil.getCanonicalStringForIsv(timestamp, suiteTicket));
    Map<String, String> params = new LinkedHashMap<>();
    params.put("timestamp", String.valueOf(timestamp));
    params.put("suiteTicket", suiteTicket);
    params.put("accessKey", context().getProperties().getSuiteKey());
    params.put("signature", signature);
    String queryString = DingTalkSignatureUtil.paramToQueryString(params, "utf-8");
    DingTalkClient client = new DefaultDingTalkClient(URL_GET_CORP_TOKEN + "?" + queryString);
    OapiServiceGetCorpTokenRequest request = new OapiServiceGetCorpTokenRequest();
    request.setAuthCorpid(corpId);
    OapiServiceGetCorpTokenResponse response;
    try {
      response = client.execute(request);
    } catch (ApiException e) {
      log.info(e.toString(), e);
      throw new AppletException(e);
    }
    if (response == null || !response.isSuccess()) {
      throw new AppletException(Optional.ofNullable(response).isPresent() ? response.getErrmsg() : "get token failed");
    }
    return response;
  }

  /**
   * 通过钉钉服务端API获取用户在当前企业的userId
   *
   * @param accessToken token
   * @param code 免登code @
   */
  private OapiUserGetuserinfoResponse getOapiUserGetuserinfo(String accessToken, String code) {
    DingTalkClient client = new DefaultDingTalkClient(URL_GET_USER_INFO);
    OapiUserGetuserinfoRequest request = new OapiUserGetuserinfoRequest();
    request.setCode(code);
    request.setHttpMethod("GET");

    OapiUserGetuserinfoResponse response;
    try {
      response = client.execute(request, accessToken);
    } catch (ApiException e) {
      e.printStackTrace();
      throw new AppletException(e);
    }
    if (response == null || !response.isSuccess()) {
      throw new AppletException(Optional.ofNullable(response).isPresent() ? response.getErrmsg() : "get user info failed");
    }
    return response;
  }

  /**
   * 通过钉钉服务端API获取用户在当前企业的用户详情
   * @param accessToken 企业访问凭证Token
   * @param userId 用户Id
   */
  private OapiUserGetResponse getOapiUserGet(String accessToken, String userId) {
    DingTalkClient client = new DefaultDingTalkClient(URL_GET_USER);
    OapiUserGetRequest request = new OapiUserGetRequest();
    request.setUserid(userId);
    request.setHttpMethod("GET");
    OapiUserGetResponse response;
    try {
      response = client.execute(request, accessToken);
    } catch (ApiException e) {
      e.printStackTrace();
      throw new AppletException(e);
    }
    if (response == null || !response.isSuccess()) {
      throw new AppletException(Optional.ofNullable(response).isPresent() ? response.getErrmsg() : "get corp user info failed");
    }
    return response;
  }

  /**
   * suiteTicket是一个定时变化的票据，主要目的是为了开发者的应用与钉钉之间访问时的安全加固。 测试应用：可随意设置，钉钉只做签名不做安全加固限制。
   * 正式应用：开发者应该从自己的db中读取suiteTicket,suiteTicket是由开发者在开发者平台设置的应用回调地址，由钉钉定时推送给应用，
   * 由开发者在回调地址所在代码解密和验证签名完成后获取到的.正式应用钉钉会在开发者代码访问时做严格检查。
   *
   * @return suiteTicket
   */
  private String getSuiteTicket(String suiteKey) {
    // 正式应用必须由应用回调地址从钉钉推送获取
    return DingTalkAppletContext.context().getBean(DingTalkCallbackService.class).getSuiteTicket(suiteKey);
  }


  /**
   * Bind Applet Account With Biz Account
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public AppletResponse bind(HttpServletRequest request) throws AppletException {

    String userId = request.getParameter("userId");
    String basePlatformPrincipalId = request.getParameter("baseId");
    String basePlatformPrincipalToken = request.getParameter("baseToken");

    if (StringUtils.isAnyBlank(userId, basePlatformPrincipalId, basePlatformPrincipalToken)) {
      throw new InvalidRequestParamException(
          "DingTalk's bind request param [userId,baseId,baseToken] must not be null or blank.");
    }

    try {
      AppletAuthModel.AppletAuthModelKey key =
          AppletAuthModel.AppletAuthModelKey.builder()
              .thirdPlatformId(userId)
              .thirdPlatformType(DING_TALK)
              .build();

      DingTalkPrincipal dingTalkPrincipal = queryPrincipal(userId);

      if(dingTalkPrincipal == null) {
        return AppletResponse.appletResponseBuilder()
            .status(AppletResponse.Status.FAILED)
            .message("用户在钉钉应用平台还未授权")
            .appletResponseBuild();
      }

      log.info("==Applets DingTalk== origin auth principal: {}", dingTalkPrincipal.toString());

      dingTalkPrincipal.setBasePlatformPrincipalToken(basePlatformPrincipalToken);
      dingTalkPrincipal.setBasePlatformPrincipalId(basePlatformPrincipalId);

      DingTalkRepository repository =
          (DingTalkRepository) AppletsSPIExtensionFactory.getRepository(DING_TALK, AppletsRepository.class);

      repository.savePrincipal(key, dingTalkPrincipal);

      log.info("==Applets DingTalk== bind finished .");

      return AppletResponse.appletResponseBuilder().appletResponseBuild();

    } catch (Exception e) {
      log.warn("==Applets DingTalk== bind dingtalk principal failed", e);
      return AppletResponse.appletResponseBuilder()
          .status(AppletResponse.Status.EXCEPTION)
          .message(e.getMessage())
          .appletResponseBuild();
    }
  }

  /**
   * Un-Bind Applet Account With Biz Account
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public AppletResponse unbind(HttpServletRequest request) throws AppletException {

    String userId = request.getParameter("userId");
    String basePlatformPrincipalId = request.getParameter("baseId");

    if (StringUtils.isAnyBlank(userId, basePlatformPrincipalId)) {
      throw new InvalidRequestParamException(
          "DingTalk's bind request param [userId,baseId] must not be null or blank.");
    }


    try {
      AppletAuthModel.AppletAuthModelKey key =
          AppletAuthModel.AppletAuthModelKey.builder()
              .thirdPlatformId(userId)
              .thirdPlatformType(DING_TALK)
              .build();

      DingTalkPrincipal dingTalkPrincipal = queryPrincipal(userId);

      if(dingTalkPrincipal == null) {
        return AppletResponse.appletResponseBuilder()
            .status(AppletResponse.Status.FAILED)
            .message("用户在钉钉应用平台还未授权")
            .appletResponseBuild();
      }

      log.info("==Applets DingTalk== bind-ed auth principal: {}", dingTalkPrincipal.toString());

      if(dingTalkPrincipal.getBasePlatformPrincipalId() != null &&
          !basePlatformPrincipalId.equalsIgnoreCase(dingTalkPrincipal.getBasePlatformPrincipalId())) {
        return AppletResponse.appletResponseBuilder()
            .status(AppletResponse.Status.FAILED)
            .message("当前钉钉绑定的账户与解绑账户不匹配.")
            .appletResponseBuild();
      }

      // un-bind
      dingTalkPrincipal.setBasePlatformPrincipalId(null);
      dingTalkPrincipal.setBasePlatformPrincipalToken(null);

      DingTalkRepository repository =
          (DingTalkRepository) AppletsSPIExtensionFactory.getRepository(DING_TALK, AppletsRepository.class);

      repository.savePrincipal(key,dingTalkPrincipal);

      log.info("==Applets DingTalk== unbind finished .");

      return AppletResponse.appletResponseBuilder().appletResponseBuild();

    } catch (Exception e) {
      log.warn("==Applets DingTalk== unbind dingtalk principal failed", e);
      return AppletResponse.appletResponseBuilder()
          .status(AppletResponse.Status.EXCEPTION)
          .message(e.getMessage())
          .appletResponseBuild();
    }
  }
}
