package com.acmedcare.framework.applet.integrate.dingtalk.endpoint;

import com.acmedcare.framework.applet.integrate.dingtalk.DingTalkIntegrateProperties;
import com.acmedcare.framework.applet.integrate.dingtalk.common.DingTalkResult;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.DingTalkSignatureUtil;
import com.dingtalk.api.request.OapiServiceGetCorpTokenRequest;
import com.dingtalk.api.request.OapiUserGetuserinfoRequest;
import com.dingtalk.api.response.OapiServiceGetCorpTokenResponse;
import com.dingtalk.api.response.OapiUserGetuserinfoResponse;
import com.taobao.api.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_AUTH_ENDPOINT;
import static com.acmedcare.framework.applet.integrate.dingtalk.contants.DingTalkConstants.URL_GET_CORP_TOKEN;
import static com.acmedcare.framework.applet.integrate.dingtalk.contants.DingTalkConstants.URL_GET_USER_INFO;

/**
 * {@link AuthEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@RestController
@RequestMapping(value = APPLET_AUTH_ENDPOINT)
public class AuthEndpoint {

  private static final Logger log = LoggerFactory.getLogger(AuthEndpoint.class);

  private final DingTalkIntegrateProperties properties;

  public AuthEndpoint(DingTalkIntegrateProperties properties) {
    this.properties = properties;
  }

  /**
   * 钉钉用户登录，显示当前登录的企业和用户
   *
   * @param corpId 授权企业的CorpId
   * @param requestAuthCode 免登临时code
   */
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  @ResponseBody
  public DingTalkResult login(
      @RequestParam(value = "corpId") String corpId,
      @RequestParam(value = "authCode") String requestAuthCode) {

    // 获取accessToken,注意正是代码要有异常流处理
    OapiServiceGetCorpTokenResponse oapiServiceGetCorpTokenResponse = getOapiServiceGetCorpToken(corpId);

    String accessToken = oapiServiceGetCorpTokenResponse.getAccessToken();

    // 获取用户信息
    OapiUserGetuserinfoResponse oapiUserGetuserinfoResponse = getOapiUserGetuserinfo(accessToken, requestAuthCode);

    Assert.notNull(oapiUserGetuserinfoResponse, "[==DingTalk==] get user info response must not be null.");

    // 3.查询得到当前用户的userId
    // 获得到userId之后应用应该处理应用自身的登录会话管理（session）,避免后续的业务交互（前端到应用服务端）每次都要重新获取用户身份，提升用户体验
    String userId = oapiUserGetuserinfoResponse.getUserid();

    // 返回结果
    Map<String, Object> result = new HashMap<>(2);
    result.put("userId", userId);
    result.put("corpId", corpId);

    return DingTalkResult.success(result);
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
    String suiteTicket = getSuiteTicket(properties.getSuiteKey());
    String signature =
        DingTalkSignatureUtil.computeSignature(
            properties.getSuiteSecret(),
            DingTalkSignatureUtil.getCanonicalStringForIsv(timestamp, suiteTicket));
    Map<String, String> params = new LinkedHashMap<>();
    params.put("timestamp", String.valueOf(timestamp));
    params.put("suiteTicket", suiteTicket);
    params.put("accessKey", properties.getSuiteKey());
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
      return null;
    }
    if (response == null || !response.isSuccess()) {
      return null;
    }
    return response;
  }

  /**
   * 通过钉钉服务端API获取用户在当前企业的userId
   *
   * @param accessToken 企业访问凭证Token
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
      return null;
    }
    if (response == null || !response.isSuccess()) {
      return null;
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
    return "temp_suite_ticket_only4_test";
  }
}
