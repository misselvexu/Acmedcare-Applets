package com.acmedcare.framework.applet.integrate.wechat.support.open.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizationInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.auth.WxOpenAuthorizerInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result.WxOpenAuthorizerInfoResult;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenAuthorizerInfoResultGsonAdapter
    implements JsonDeserializer<WxOpenAuthorizerInfoResult> {
  @Override
  public WxOpenAuthorizerInfoResult deserialize(
      JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
      throws JsonParseException {
    WxOpenAuthorizerInfoResult authorizerInfoResult = new WxOpenAuthorizerInfoResult();
    JsonObject jsonObject = jsonElement.getAsJsonObject();

    WxOpenAuthorizationInfo authorizationInfo =
        WxOpenGsonBuilder.create()
            .fromJson(
                jsonObject.get("authorization_info"),
                new TypeToken<WxOpenAuthorizationInfo>() {}.getType());

    authorizerInfoResult.setAuthorizationInfo(authorizationInfo);
    WxOpenAuthorizerInfo authorizerInfo =
        WxOpenGsonBuilder.create()
            .fromJson(
                jsonObject.get("authorizer_info"),
                new TypeToken<WxOpenAuthorizerInfo>() {}.getType());

    authorizerInfoResult.setAuthorizerInfo(authorizerInfo);
    return authorizerInfoResult;
  }
}
