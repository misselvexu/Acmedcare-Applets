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
public class WxMpXmlOutDeviceMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = -3093843149649157587L;

  @XStreamAlias("DeviceType")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String deviceType;

  @XStreamAlias("DeviceID")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String deviceId;

  @XStreamAlias("Content")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String content;

  @XStreamAlias("SessionID")
  @XStreamConverter(value = XStreamCDataConverter.class)
  private String sessionId;

  public WxMpXmlOutDeviceMessage() {
    this.msgType = WxConsts.XmlMsgType.DEVICE_TEXT;
  }
}
