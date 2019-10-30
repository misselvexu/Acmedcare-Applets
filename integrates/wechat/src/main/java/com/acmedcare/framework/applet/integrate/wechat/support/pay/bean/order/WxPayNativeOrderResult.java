package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.order;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * <pre>
 * 微信扫码支付统一下单后发起支付拼接所需参数实现类
 * Created by Acmedcare+ Developer on 2017-9-1.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@AllArgsConstructor
public class WxPayNativeOrderResult implements Serializable {
  private static final long serialVersionUID = 887792717425241444L;

  private String codeUrl;
}
