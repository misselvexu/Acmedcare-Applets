package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class WxMpCardLandingPageCreateResult implements Serializable {
  private Integer errcode;
  private String errmsg;

  /** 货架链接。 */
  private String url;
  /** 货架ID。货架的唯一标识 */
  @SerializedName("page_id")
  private Integer pageId;

  public static WxMpCardLandingPageCreateResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpCardLandingPageCreateResult.class);
  }

  public boolean isSuccess() {
    return 0 == errcode;
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
