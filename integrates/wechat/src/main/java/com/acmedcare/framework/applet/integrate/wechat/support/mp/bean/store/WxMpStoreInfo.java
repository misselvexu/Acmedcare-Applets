package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.store;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * .
 *
 * @author BinaryWang
 */
@Data
public class WxMpStoreInfo implements Serializable {
  private static final long serialVersionUID = 7300598931768355461L;

  @SerializedName("base_info")
  private WxMpStoreBaseInfo baseInfo;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
