package com.acmedcare.framework.applet.integrate.wechat.support.pay.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 *
 * <pre>
 *  支付请求默认对象类
 *  Created by BinaryWang on 2017/6/18.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@XStreamAlias("xml")
public class WxPayDefaultRequest extends BaseWxPayRequest {
  @Override
  protected void checkConstraints() {
    // do nothing
  }

  @Override
  protected boolean ignoreAppid() {
    return true;
  }
}
