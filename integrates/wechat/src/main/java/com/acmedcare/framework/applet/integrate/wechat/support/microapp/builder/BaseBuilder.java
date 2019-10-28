package com.acmedcare.framework.applet.integrate.wechat.support.microapp.builder;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaKefuMessage;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class BaseBuilder<T> {
  protected String msgType;
  protected String toUser;

  @SuppressWarnings("unchecked")
  public T toUser(String toUser) {
    this.toUser = toUser;
    return (T) this;
  }

  /** 构造器方法. */
  public WxMaKefuMessage build() {
    WxMaKefuMessage m = new WxMaKefuMessage();
    m.setMsgType(this.msgType);
    m.setToUser(this.toUser);
    return m;
  }
}
