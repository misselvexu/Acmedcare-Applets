package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.order;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * <pre>
 * APP支付调用统一下单接口后的组装所需参数的实现类
 * 参考 https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_12
 * Created by Acmedcare+ Developer on 2017-9-1.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@Builder
public class WxPayAppOrderResult implements Serializable {
  private static final long serialVersionUID = 5408678833978707228L;

  private String sign;
  private String prepayId;
  private String partnerId;
  private String appId;
  /** 由于package为java保留关键字，因此改为packageValue. 前端使用时记得要更改为package */
  private String packageValue;

  private String timeStamp;
  private String nonceStr;
}
