package com.acmedcare.framework.applet.integrate.wechat.support.mp.builder.kefu;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.WxMpKefuMessage;

public class BaseBuilder<T> {
  protected String msgType;
  protected String toUser;

  @SuppressWarnings("unchecked")
  public T toUser(String toUser) {
    this.toUser = toUser;
    return (T) this;
  }

  public WxMpKefuMessage build() {
    WxMpKefuMessage m = new WxMpKefuMessage();
    m.setMsgType(this.msgType);
    m.setToUser(this.toUser);
    return m;
  }
}
