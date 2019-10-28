package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialArticleUpdate;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialNews;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class WxMpMaterialArticleUpdateGsonAdapter
    implements JsonSerializer<WxMpMaterialArticleUpdate> {

  @Override
  public JsonElement serialize(
      WxMpMaterialArticleUpdate wxMpMaterialArticleUpdate,
      Type typeOfSrc,
      JsonSerializationContext context) {
    JsonObject articleUpdateJson = new JsonObject();
    articleUpdateJson.addProperty("media_id", wxMpMaterialArticleUpdate.getMediaId());
    articleUpdateJson.addProperty("index", wxMpMaterialArticleUpdate.getIndex());
    articleUpdateJson.add(
        "articles",
        WxMpGsonBuilder.create()
            .toJsonTree(
                wxMpMaterialArticleUpdate.getArticles(),
                WxMpMaterialNews.WxMpMaterialNewsArticle.class));
    return articleUpdateJson;
  }
}
