package com.acmedcare.framework.applet.integrate.wechat.support.open.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.open.util.json.WxOpenGsonBuilder;

import java.io.Serializable;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenComponentAccessToken implements Serializable {
  private static final long serialVersionUID = 2134550135400443725L;

  private String componentAccessToken;

  private int expiresIn = -1;

  public static WxOpenComponentAccessToken fromJson(String json) {
    return WxOpenGsonBuilder.create().fromJson(json, WxOpenComponentAccessToken.class);
  }

  public String getComponentAccessToken() {
    return componentAccessToken;
  }

  public void setComponentAccessToken(String componentAccessToken) {
    this.componentAccessToken = componentAccessToken;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }
}
