package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.shake;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.GsonHelper;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.JsonObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class WxMpShakeAroundPageAddResult implements Serializable {
  private Integer errorCode;
  private String errorMsg;
  private Integer pageId;

  public static WxMpShakeAroundPageAddResult fromJson(String json) {
    JsonObject jsonObject = WxMpGsonBuilder.create().fromJson(json, JsonObject.class);
    WxMpShakeAroundPageAddResult result = new WxMpShakeAroundPageAddResult();
    result.setErrorCode(GsonHelper.getInteger(jsonObject, "errcode"));
    result.setErrorMsg(GsonHelper.getString(jsonObject, "errmsg"));
    jsonObject = jsonObject.getAsJsonObject("data");
    if (jsonObject != null) {
      result.setPageId(GsonHelper.getInteger(jsonObject, "page_id"));
    }
    return result;
  }
}
