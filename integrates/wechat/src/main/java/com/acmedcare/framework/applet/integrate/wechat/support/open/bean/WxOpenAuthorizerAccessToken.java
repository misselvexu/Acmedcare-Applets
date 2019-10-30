package com.acmedcare.framework.applet.integrate.wechat.support.open.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.open.util.json.WxOpenGsonBuilder;

import java.io.Serializable;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenAuthorizerAccessToken implements Serializable {
  private static final long serialVersionUID = -4069745419280727420L;

  private String authorizerAccessToken;

  private int expiresIn = -1;

  public static WxOpenAuthorizerAccessToken fromJson(String json) {
    return WxOpenGsonBuilder.create().fromJson(json, WxOpenAuthorizerAccessToken.class);
  }

  public String getAuthorizerAccessToken() {
    return authorizerAccessToken;
  }

  public void setAuthorizerAccessToken(String authorizerAccessToken) {
    this.authorizerAccessToken = authorizerAccessToken;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }
}
