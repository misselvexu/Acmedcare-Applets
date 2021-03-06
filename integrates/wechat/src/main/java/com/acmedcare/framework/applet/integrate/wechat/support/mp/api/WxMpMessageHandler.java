package com.acmedcare.framework.applet.integrate.wechat.support.mp.api;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.WxSessionManager;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message.WxMpXmlMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message.WxMpXmlOutMessage;

import java.util.Map;

/**
 * 处理微信推送消息的处理器接口.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxMpMessageHandler {

  /**
   * 处理微信推送消息.
   *
   * @param wxMessage 微信推送消息
   * @param context 上下文，如果handler或interceptor之间有信息要传递，可以用这个
   * @param wxMpService 服务类
   * @param sessionManager session管理器
   * @return xml格式的消息，如果在异步规则里处理的话，可以返回null
   * @throws WxErrorException 异常
   */
  WxMpXmlOutMessage handle(
      WxMpXmlMessage wxMessage,
      Map<String, Object> context,
      WxMpService wxMpService,
      WxSessionManager sessionManager)
      throws WxErrorException;
}
