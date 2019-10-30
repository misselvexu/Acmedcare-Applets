package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.order;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * <pre>
 * 微信H5支付统一下单后发起支付拼接所需参数实现类.
 * Created by Acmedcare+ Developer on 2018-4-21.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@AllArgsConstructor
public class WxPayMwebOrderResult implements Serializable {
  private static final long serialVersionUID = 8866329695767762066L;

  @XStreamAlias("mwebUrl")
  private String mwebUrl;
}
