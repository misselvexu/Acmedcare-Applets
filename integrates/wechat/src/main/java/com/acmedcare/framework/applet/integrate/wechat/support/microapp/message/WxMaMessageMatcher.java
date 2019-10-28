package com.acmedcare.framework.applet.integrate.wechat.support.microapp.message;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaMessage;

/**
 * 消息匹配器，用在消息路由的时候.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxMaMessageMatcher {

  /**
   * 消息是否匹配某种模式.
   *
   * @param message 消息
   * @return 是否匹配
   */
  boolean match(WxMaMessage message);
}
