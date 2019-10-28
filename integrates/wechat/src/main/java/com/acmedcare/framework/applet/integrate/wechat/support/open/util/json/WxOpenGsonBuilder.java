package com.acmedcare.framework.applet.integrate.wechat.support.open.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.WxOpenAuthorizerAccessToken;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.WxOpenComponentAccessToken;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizationInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizerInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/** @author <a href="https://github.com/007gzs">007</a> */
public class WxOpenGsonBuilder {

  private static final GsonBuilder INSTANCE = new GsonBuilder();

  static {
    INSTANCE.disableHtmlEscaping();
    INSTANCE.registerTypeAdapter(
        WxOpenComponentAccessToken.class, new WxOpenComponentAccessTokenGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxOpenAuthorizerAccessToken.class, new WxOpenAuthorizerAccessTokenGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxOpenAuthorizationInfo.class, new WxOpenAuthorizationInfoGsonAdapter());
    INSTANCE.registerTypeAdapter(WxOpenAuthorizerInfo.class, new WxOpenAuthorizerInfoGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxOpenQueryAuthResult.class, new WxOpenQueryAuthResultGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxOpenAuthorizerInfoResult.class, new WxOpenAuthorizerInfoResultGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxOpenAuthorizerOptionResult.class, new WxOpenAuthorizerOptionResultGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxFastMaAccountBasicInfoResult.class, new WxFastMaAccountBasicInfoGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxOpenAuthorizerListResult.class, new WxOpenAuthorizerListResultGsonAdapter());
  }

  public static Gson create() {
    return INSTANCE.create();
  }
}
