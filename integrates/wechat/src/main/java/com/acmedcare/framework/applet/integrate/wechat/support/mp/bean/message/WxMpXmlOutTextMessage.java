package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message;

import com.acmedcare.framework.applet.integrate.wechat.support.common.api.WxConsts;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.xml.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

@XStreamAlias("xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutTextMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -3972786455288763361L;

  @XStreamAlias("Content")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String content;

  public WxMpXmlOutTextMessage() {
    this.msgType = WxConsts.XmlMsgType.TEXT;
  }
}
