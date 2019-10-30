package com.acmedcare.framework.applet.integrate.wechat.support.open.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.GsonHelper;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result.WxOpenAuthorizerOptionResult;
import com.google.gson.*;

import java.lang.reflect.Type;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenAuthorizerOptionResultGsonAdapter
    implements JsonDeserializer<WxOpenAuthorizerOptionResult> {
  @Override
  public WxOpenAuthorizerOptionResult deserialize(
      JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
      throws JsonParseException {
    WxOpenAuthorizerOptionResult authorizerOptionResult = new WxOpenAuthorizerOptionResult();
    JsonObject jsonObject = jsonElement.getAsJsonObject();
    authorizerOptionResult.setAuthorizerAppid(GsonHelper.getString(jsonObject, "authorizer_appid"));
    authorizerOptionResult.setOptionName(GsonHelper.getString(jsonObject, "option_name"));
    authorizerOptionResult.setOptionValue(GsonHelper.getString(jsonObject, "option_value"));
    return authorizerOptionResult;
  }
}
