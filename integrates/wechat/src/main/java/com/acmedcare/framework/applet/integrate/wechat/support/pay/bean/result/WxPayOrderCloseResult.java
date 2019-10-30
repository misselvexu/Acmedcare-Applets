package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 *
 * <pre>
 * 关闭订单结果对象类
 * Created by Acmedcare+ Developer on 2016-10-27.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@XStreamAlias("xml")
public class WxPayOrderCloseResult extends BaseWxPayResult {

  /** 业务结果描述 */
  @XStreamAlias("result_msg")
  private String resultMsg;
}
