package com.acmedcare.framework.applet.integrate.wechat.support.microapp.message;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.WxSessionManager;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaMessage;

import java.util.Map;

/**
 * 微信消息拦截器，可以用来做验证.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxMaMessageInterceptor {

  /**
   * 拦截微信消息.
   *
   * @param wxMessage .
   * @param context 上下文，如果handler或interceptor之间有信息要传递，可以用这个
   * @param wxMaService .
   * @param sessionManager .
   * @return true代表OK，false代表不OK
   * @throws WxErrorException .
   */
  boolean intercept(
      WxMaMessage wxMessage,
      Map<String, Object> context,
      WxMaService wxMaService,
      WxSessionManager sessionManager)
      throws WxErrorException;
}
