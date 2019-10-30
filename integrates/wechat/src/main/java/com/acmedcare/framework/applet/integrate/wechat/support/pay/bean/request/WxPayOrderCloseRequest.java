package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.*;

/**
 *
 *
 * <pre>
 *  关闭订单请求对象类
 * Created by Acmedcare+ Developer on 2016-10-27.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("xml")
public class WxPayOrderCloseRequest extends BaseWxPayRequest {

  /**
   *
   *
   * <pre>
   * 商户订单号
   * out_trade_no
   * 二选一
   * String(32)
   * 20150806125346
   * 商户系统内部的订单号，当没提供transaction_id时需要传这个。
   * </pre>
   */
  @XStreamAlias("out_trade_no")
  private String outTradeNo;

  @Override
  protected void checkConstraints() {}
}
