package com.acmedcare.framework.applet.integrate.wechat.support.mp.builder.outxml;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message.WxMpXmlOutTextMessage;

/**
 * 文本消息builder
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public final class TextBuilder extends BaseBuilder<TextBuilder, WxMpXmlOutTextMessage> {
  private String content;

  public TextBuilder content(String content) {
    this.content = content;
    return this;
  }

  @Override
  public WxMpXmlOutTextMessage build() {
    WxMpXmlOutTextMessage m = new WxMpXmlOutTextMessage();
    setCommon(m);
    m.setContent(this.content);
    return m;
  }
}
