package com.acmedcare.framework.applet.integrate.wechat.support.microapp.builder;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.constant.WxMaConstants;

/**
 * 图片消息builder.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public final class ImageMessageBuilder extends BaseBuilder<ImageMessageBuilder> {
  private String mediaId;

  public ImageMessageBuilder() {
    this.msgType = WxMaConstants.KefuMsgType.IMAGE;
  }

  public ImageMessageBuilder mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  @Override
  public WxMaKefuMessage build() {
    WxMaKefuMessage m = super.build();
    m.setImage(new WxMaKefuMessage.KfImage(this.mediaId));
    return m;
  }
}
