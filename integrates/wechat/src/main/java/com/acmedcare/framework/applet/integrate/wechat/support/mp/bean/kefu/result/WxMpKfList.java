package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.result;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpKfList implements Serializable {
  private static final long serialVersionUID = -8194193505173564894L;

  @SerializedName("kf_list")
  private List<WxMpKfInfo> kfList;

  public static WxMpKfList fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpKfList.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
