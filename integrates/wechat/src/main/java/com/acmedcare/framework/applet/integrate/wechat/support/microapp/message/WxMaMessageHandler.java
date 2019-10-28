package com.acmedcare.framework.applet.integrate.wechat.support.microapp.message;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.WxSessionManager;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaMessage;

import java.util.Map;

/**
 * 处理小程序推送消息的处理器接口.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxMaMessageHandler {
  /**
   * 处理消息.
   *
   * @param message 输入消息
   * @param context 上下文
   * @param service 服务类
   * @param sessionManager session管理器
   * @return 输出消息
   * @throws WxErrorException 异常
   */
  WxMaXmlOutMessage handle(
      WxMaMessage message,
      Map<String, Object> context,
      WxMaService service,
      WxSessionManager sessionManager)
      throws WxErrorException;
}
