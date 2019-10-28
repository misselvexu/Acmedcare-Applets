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
public class WxMpKfSessionList implements Serializable {
  private static final long serialVersionUID = -7680371346226640206L;

  /** 会话列表 */
  @SerializedName("sessionlist")
  private List<WxMpKfSession> kfSessionList;

  public static WxMpKfSessionList fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpKfSessionList.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
