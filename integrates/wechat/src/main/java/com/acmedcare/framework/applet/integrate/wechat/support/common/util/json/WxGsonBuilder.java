package com.acmedcare.framework.applet.integrate.wechat.support.common.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.WxAccessToken;
import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.menu.WxMenu;
import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.result.WxMediaUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * .
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxGsonBuilder {

  private static final GsonBuilder INSTANCE = new GsonBuilder();

  static {
    INSTANCE.disableHtmlEscaping();
    INSTANCE.registerTypeAdapter(WxAccessToken.class, new WxAccessTokenAdapter());
    INSTANCE.registerTypeAdapter(WxError.class, new WxErrorAdapter());
    INSTANCE.registerTypeAdapter(WxMenu.class, new WxMenuGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMediaUploadResult.class, new WxMediaUploadResultAdapter());
  }

  public static Gson create() {
    return INSTANCE.create();
  }
}
