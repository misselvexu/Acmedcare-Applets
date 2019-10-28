package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.GsonHelper;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpChangeOpenid;
import com.google.gson.*;

import java.lang.reflect.Type;

public class WxMpChangeOpenidGsonAdapter implements JsonDeserializer<WxMpChangeOpenid> {

  @Override
  public WxMpChangeOpenid deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject o = json.getAsJsonObject();
    WxMpChangeOpenid changeOpenid = new WxMpChangeOpenid();
    changeOpenid.setOriOpenid(GsonHelper.getString(o, "ori_openid"));
    changeOpenid.setNewOpenid(GsonHelper.getString(o, "new_openid"));
    changeOpenid.setErrMsg(GsonHelper.getString(o, "err_msg"));
    return changeOpenid;
  }
}
