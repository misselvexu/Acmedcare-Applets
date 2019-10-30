package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
@Data
public class WxOpenAuthorizationInfo implements Serializable {
  private static final long serialVersionUID = -8713680081354754208L;

  private String authorizerAppid;
  private String authorizerAccessToken;
  private int expiresIn;
  private String authorizerRefreshToken;
  private List<Integer> funcInfo;
}
