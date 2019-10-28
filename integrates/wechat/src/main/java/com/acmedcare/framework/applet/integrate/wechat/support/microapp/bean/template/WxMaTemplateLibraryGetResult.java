package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.template;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class WxMaTemplateLibraryGetResult implements Serializable {

  private static final long serialVersionUID = -190847592776636744L;
  private String id;
  private String title;

  @SerializedName("keyword_list")
  private List<KeywordInfo> keywordList;

  public static WxMaTemplateLibraryGetResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxMaTemplateLibraryGetResult.class);
  }

  @Data
  public static class KeywordInfo {

    @SerializedName("keyword_id")
    private int keywordId;

    private String name;
    private String example;
  }
}
