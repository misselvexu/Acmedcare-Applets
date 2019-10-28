package com.acmedcare.framework.applet.integrate.wechat.support.open.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizationInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result.WxOpenQueryAuthResult;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/** @author <a href="https://github.com/007gzs">007</a> */
public class WxOpenQueryAuthResultGsonAdapter implements JsonDeserializer<WxOpenQueryAuthResult> {
  @Override
  public WxOpenQueryAuthResult deserialize(
      JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
      throws JsonParseException {
    WxOpenQueryAuthResult queryAuthResult = new WxOpenQueryAuthResult();
    JsonObject jsonObject = jsonElement.getAsJsonObject();

    WxOpenAuthorizationInfo authorizationInfo =
        WxOpenGsonBuilder.create()
            .fromJson(
                jsonObject.get("authorization_info"),
                new TypeToken<WxOpenAuthorizationInfo>() {}.getType());

    queryAuthResult.setAuthorizationInfo(authorizationInfo);
    return queryAuthResult;
  }
}
