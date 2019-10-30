package com.acmedcare.framework.applet.integrate.wechat.support.open.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.GsonHelper;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.WxOpenComponentAccessToken;
import com.google.gson.*;

import java.lang.reflect.Type;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenComponentAccessTokenGsonAdapter
    implements JsonDeserializer<WxOpenComponentAccessToken> {
  @Override
  public WxOpenComponentAccessToken deserialize(
      JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
      throws JsonParseException {
    WxOpenComponentAccessToken componentAccessToken = new WxOpenComponentAccessToken();
    JsonObject jsonObject = jsonElement.getAsJsonObject();
    componentAccessToken.setComponentAccessToken(
        GsonHelper.getString(jsonObject, "component_access_token"));
    componentAccessToken.setExpiresIn(GsonHelper.getPrimitiveInteger(jsonObject, "expires_in"));
    return componentAccessToken;
  }
}
