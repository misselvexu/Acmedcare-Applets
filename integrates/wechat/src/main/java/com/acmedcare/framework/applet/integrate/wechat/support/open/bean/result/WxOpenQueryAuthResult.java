package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result;

import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizationInfo;
import lombok.Data;

import java.io.Serializable;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
@Data
public class WxOpenQueryAuthResult implements Serializable {
  private static final long serialVersionUID = 2394736235020206855L;

  private WxOpenAuthorizationInfo authorizationInfo;
}
