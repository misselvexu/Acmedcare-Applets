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
public class WxMpKfOnlineList implements Serializable {
  private static final long serialVersionUID = -6154705288500854617L;

  @SerializedName("kf_online_list")
  private List<WxMpKfInfo> kfOnlineList;

  public static WxMpKfOnlineList fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpKfOnlineList.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
