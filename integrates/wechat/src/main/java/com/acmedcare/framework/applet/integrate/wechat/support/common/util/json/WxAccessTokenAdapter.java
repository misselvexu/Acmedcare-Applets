package com.acmedcare.framework.applet.integrate.wechat.support.common.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.WxAccessToken;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxAccessTokenAdapter implements JsonDeserializer<WxAccessToken> {

  @Override
  public WxAccessToken deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    WxAccessToken accessToken = new WxAccessToken();
    JsonObject accessTokenJsonObject = json.getAsJsonObject();

    if (accessTokenJsonObject.get("access_token") != null
        && !accessTokenJsonObject.get("access_token").isJsonNull()) {
      accessToken.setAccessToken(GsonHelper.getAsString(accessTokenJsonObject.get("access_token")));
    }
    if (accessTokenJsonObject.get("expires_in") != null
        && !accessTokenJsonObject.get("expires_in").isJsonNull()) {
      accessToken.setExpiresIn(
          GsonHelper.getAsPrimitiveInt(accessTokenJsonObject.get("expires_in")));
    }
    return accessToken;
  }
}
