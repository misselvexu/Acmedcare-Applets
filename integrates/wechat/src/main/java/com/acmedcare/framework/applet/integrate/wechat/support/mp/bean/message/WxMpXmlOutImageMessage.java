package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message;

import com.acmedcare.framework.applet.integrate.wechat.support.common.api.WxConsts;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.xml.XStreamMediaIdConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

@XStreamAlias("xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutImageMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -2684778597067990723L;

  @XStreamAlias("Image")
  @XStreamConverter(value = XStreamMediaIdConverter.class)
  private String mediaId;

  public WxMpXmlOutImageMessage() {
    this.msgType = WxConsts.XmlMsgType.IMAGE;
  }
}
