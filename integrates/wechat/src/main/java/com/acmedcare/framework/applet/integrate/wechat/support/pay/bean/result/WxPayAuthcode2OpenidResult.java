package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 *
 * <pre>
 *  授权码查询openid接口请求结果类
 * Created by Acmedcare+ Developer on 2017-3-27.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@XStreamAlias("xml")
public class WxPayAuthcode2OpenidResult extends BaseWxPayResult {
  /**
   *
   *
   * <pre>
   *   用户标识.
   *   openid
   *   是
   *   String(128)
   *   用户在商户appid下的唯一标识
   * </pre>
   */
  @XStreamAlias("openid")
  private String openid;
}
