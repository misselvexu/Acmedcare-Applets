package com.acmedcare.framework.applet.integrate.wechat.service;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;
import com.acmedcare.framework.applet.integrate.wechat.WeChatAppletContext;
import com.acmedcare.framework.applet.integrate.wechat.bean.WeChatPrincipal;
import com.acmedcare.framework.applet.integrate.wechat.repository.WeChatRepositpory;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaJscode2SessionResult;
import com.acmedcare.framework.kits.StringUtils;
import com.acmedcare.framework.kits.executor.AsyncRuntimeExecutor;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static com.acmedcare.framework.applet.integrate.wechat.WeChatExtensionDefined.WECHAT;

/**
 * {@link WeChatAuthService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/10/24.
 */
@Extension(WECHAT)
public class WeChatAuthService implements AuthService {

  private static final Logger log = LoggerFactory.getLogger(WeChatAuthService.class);

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

    String jsCode = request.getParameter("jsCode");

    if (StringUtils.isBlank(jsCode)) {
      throw new AppletException("WeChat auth request 'jsCode' must be null or blank.");
    }

    try {
      WxMaService service = WeChatAppletContext.context().getBean(WxMaService.class);

      WxMaJscode2SessionResult result = service.getUserService().getSessionInfo(jsCode);

      String accessToken = service.getAccessToken();

      // save session_key
      WeChatPrincipal principal =
          WeChatPrincipal.builder()
              .openid(result.getOpenid())
              .unionid(result.getUnionid())
              .sessionKey(result.getSessionKey())
              .build();

      AsyncRuntimeExecutor.getAsyncThreadPool()
          .execute(() -> savePrincipal(result.getOpenid(), principal));

      Map<String, Object> res = Maps.newHashMap();
      res.put("access_token", accessToken);
      res.put("open_id", result.getOpenid());
      res.put("union_id", result.getUnionid());

      return AppletResponse.appletResponseBuilder().data(res).appletResponseBuild();
    } catch (Exception e) {
      log.error("==Applets WeChat== auth request process failed", e);
      throw new AppletException("WeChat auth request process failed");
    }
  }

  private void savePrincipal(String openid, WeChatPrincipal principal) {

    try {
      AppletAuthModel.AppletAuthModelKey key =
          AppletAuthModel.AppletAuthModelKey.builder()
              .thirdPlatformId(openid)
              .thirdPlatformType(WECHAT)
              .build();

      WeChatRepositpory repository =
          (WeChatRepositpory)
              AppletsSPIExtensionFactory.getRepository(WECHAT, AppletsRepository.class);

      repository.savePrincipal(key, principal);

    } catch (Exception e) {
      log.warn("==Applets WeChat== save dingtalk principal failed", e);
    }
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
    return null;
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
    return null;
  }
}
