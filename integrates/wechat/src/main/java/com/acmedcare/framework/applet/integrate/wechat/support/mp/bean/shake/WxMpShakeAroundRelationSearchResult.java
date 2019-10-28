package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.shake;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class WxMpShakeAroundRelationSearchResult implements Serializable {
  private Integer errcode;
  private String errmsg;
  private WxMpShakeAcoundRelationSearch data;

  public static WxMpShakeAroundRelationSearchResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpShakeAroundRelationSearchResult.class);
  }

  @Data
  public static class WxMpShakeAcoundRelationSearch implements Serializable {
    private List<WxMpDeviceIdentifier> relations;
    private Integer total_count;
  }
}
