package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.GsonHelper;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialFileBatchGetResult;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Date;

public class WxMpMaterialFileBatchGetGsonItemAdapter
    implements JsonDeserializer<WxMpMaterialFileBatchGetResult.WxMaterialFileBatchGetNewsItem> {

  @Override
  public WxMpMaterialFileBatchGetResult.WxMaterialFileBatchGetNewsItem deserialize(
      JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
      throws JsonParseException {
    WxMpMaterialFileBatchGetResult.WxMaterialFileBatchGetNewsItem newsItem =
        new WxMpMaterialFileBatchGetResult.WxMaterialFileBatchGetNewsItem();
    JsonObject json = jsonElement.getAsJsonObject();
    if (json.get("media_id") != null && !json.get("media_id").isJsonNull()) {
      newsItem.setMediaId(GsonHelper.getAsString(json.get("media_id")));
    }
    if (json.get("update_time") != null && !json.get("update_time").isJsonNull()) {
      newsItem.setUpdateTime(new Date(1000 * GsonHelper.getAsLong(json.get("update_time"))));
    }
    if (json.get("name") != null && !json.get("name").isJsonNull()) {
      newsItem.setName(GsonHelper.getAsString(json.get("name")));
    }
    if (json.get("url") != null && !json.get("url").isJsonNull()) {
      newsItem.setUrl(GsonHelper.getAsString(json.get("url")));
    }
    return newsItem;
  }
}
