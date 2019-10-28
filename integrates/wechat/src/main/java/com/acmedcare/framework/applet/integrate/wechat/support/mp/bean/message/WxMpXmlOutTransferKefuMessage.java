package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message;

import com.acmedcare.framework.applet.integrate.wechat.support.common.api.WxConsts;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.xml.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@XStreamAlias("xml")
@Data
@EqualsAndHashCode(callSuper = true)
public class WxMpXmlOutTransferKefuMessage extends WxMpXmlOutMessage {
  private static final long serialVersionUID = 1850903037285841322L;

  @XStreamAlias("TransInfo")
  protected TransInfo transInfo;

  public WxMpXmlOutTransferKefuMessage() {
    this.msgType = WxConsts.KefuMsgType.TRANSFER_CUSTOMER_SERVICE;
  }

  @XStreamAlias("TransInfo")
  @Data
  public static class TransInfo implements Serializable {
    private static final long serialVersionUID = -6317885617135706056L;

    @XStreamAlias("KfAccount")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String kfAccount;
  }
}
