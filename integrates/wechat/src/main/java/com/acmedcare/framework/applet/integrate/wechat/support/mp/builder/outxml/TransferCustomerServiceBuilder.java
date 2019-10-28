package com.acmedcare.framework.applet.integrate.wechat.support.mp.builder.outxml;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message.WxMpXmlOutTransferKefuMessage;
import org.apache.commons.lang3.StringUtils;

/**
 * 客服消息builder
 *
 * <pre>
 * 用法: WxMpXmlOutTransferKefuMessage m = WxMpXmlOutMessage.TRANSFER_CUSTOMER_SERVICE().kfAccount("").toUser("").build();
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public final class TransferCustomerServiceBuilder
    extends BaseBuilder<TransferCustomerServiceBuilder, WxMpXmlOutTransferKefuMessage> {
  private String kfAccount;

  public TransferCustomerServiceBuilder kfAccount(String kf) {
    this.kfAccount = kf;
    return this;
  }

  @Override
  public WxMpXmlOutTransferKefuMessage build() {
    WxMpXmlOutTransferKefuMessage m = new WxMpXmlOutTransferKefuMessage();
    setCommon(m);
    if (StringUtils.isNotBlank(this.kfAccount)) {
      WxMpXmlOutTransferKefuMessage.TransInfo transInfo =
          new WxMpXmlOutTransferKefuMessage.TransInfo();
      transInfo.setKfAccount(this.kfAccount);
      m.setTransInfo(transInfo);
    }

    return m;
  }
}
