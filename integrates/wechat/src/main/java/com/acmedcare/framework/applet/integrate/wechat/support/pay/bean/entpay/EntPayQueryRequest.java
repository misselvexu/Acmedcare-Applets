package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.entpay;

import com.acmedcare.framework.applet.integrate.wechat.support.common.annotation.Required;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.request.BaseWxPayRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.*;

/**
 *
 *
 * <pre>
 * 企业付款请求对象.
 * Created by Acmedcare+ Developer on 2016/10/19.
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
public class EntPayQueryRequest extends BaseWxPayRequest {
  private static final long serialVersionUID = 1972288742207813985L;

  /**
   *
   *
   * <pre>
   * 字段名：商户订单号.
   * 变量名：partner_trade_no
   * 是否必填：是
   * 示例值：10000098201411111234567890
   * 类型：String
   * 描述商户订单号
   * </pre>
   */
  @Required
  @XStreamAlias("partner_trade_no")
  private String partnerTradeNo;

  @Override
  protected void checkConstraints() {
    // do nothing
  }

  @Override
  public String toString() {
    return WxGsonBuilder.create().toJson(this);
  }

  @Override
  protected String[] getIgnoredParamsForSign() {
    return new String[] {"sign_type"};
  }
}
