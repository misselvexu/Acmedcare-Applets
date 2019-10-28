package com.acmedcare.framework.applet.integrate.wechat.support.microapp.builder;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.constant.WxMaConstants;

/**
 * 文本消息builder.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public final class TextMessageBuilder extends BaseBuilder<TextMessageBuilder> {
  private String content;

  public TextMessageBuilder() {
    this.msgType = WxMaConstants.KefuMsgType.TEXT;
  }

  public TextMessageBuilder content(String content) {
    this.content = content;
    return this;
  }

  @Override
  public WxMaKefuMessage build() {
    WxMaKefuMessage m = super.build();
    m.setText(new WxMaKefuMessage.KfText(this.content));
    return m;
  }
}
