package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result;

import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizationInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizerInfo;
import lombok.Data;

import java.io.Serializable;

/** @author <a href="https://github.com/007gzs">007</a> */
@Data
public class WxOpenAuthorizerInfoResult implements Serializable {
  private static final long serialVersionUID = 3166298050833019785L;

  private WxOpenAuthorizationInfo authorizationInfo;
  private WxOpenAuthorizerInfo authorizerInfo;

  public boolean isMiniProgram() {
    return authorizerInfo != null && authorizerInfo.getMiniProgramInfo() != null;
  }
}
