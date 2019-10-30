package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.marketing;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
@Data
public class WxMpAdLeadResult implements Serializable {
  protected static final JsonParser JSON_PARSER = new JsonParser();
  private static final long serialVersionUID = -1526796632563660821L;

  @SerializedName("page_info")
  private WxMpAdLeadPageInfo pageInfo;

  @SerializedName("list")
  private List<WxMpAdLead> adLeads;

  public static WxMpAdLeadResult fromJson(String json) {

    return WxMpGsonBuilder.create()
        .fromJson(
            JSON_PARSER.parse(json).getAsJsonObject().get("data"),
            new TypeToken<WxMpAdLeadResult>() {}.getType());
  }
}
