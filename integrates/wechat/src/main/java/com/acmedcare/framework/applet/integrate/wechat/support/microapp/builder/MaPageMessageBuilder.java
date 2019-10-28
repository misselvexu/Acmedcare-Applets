package com.acmedcare.framework.applet.integrate.wechat.support.microapp.builder;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.constant.WxMaConstants;

/**
 * 小程序卡片消息builder
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class MaPageMessageBuilder extends BaseBuilder<MaPageMessageBuilder> {
  private String title;
  private String pagePath;
  private String thumbMediaId;

  public MaPageMessageBuilder() {
    this.msgType = WxMaConstants.KefuMsgType.MA_PAGE;
  }

  public MaPageMessageBuilder title(String title) {
    this.title = title;
    return this;
  }

  public MaPageMessageBuilder pagePath(String pagePath) {
    this.pagePath = pagePath;
    return this;
  }

  public MaPageMessageBuilder thumbMediaId(String thumbMediaId) {
    this.thumbMediaId = thumbMediaId;
    return this;
  }

  @Override
  public WxMaKefuMessage build() {
    WxMaKefuMessage m = super.build();
    m.setMaPage(
        WxMaKefuMessage.KfMaPage.builder()
            .title(this.title)
            .pagePath(this.pagePath)
            .thumbMediaId(this.thumbMediaId)
            .build());
    return m;
  }
}
