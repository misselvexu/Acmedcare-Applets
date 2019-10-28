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
public class WxMpKfSessionWaitCaseList implements Serializable {
  private static final long serialVersionUID = 2432132626631361922L;

  /** count 未接入会话数量 */
  @SerializedName("count")
  private Long count;

  /** waitcaselist 未接入会话列表，最多返回100条数据 */
  @SerializedName("waitcaselist")
  private List<WxMpKfSession> kfSessionWaitCaseList;

  public static WxMpKfSessionWaitCaseList fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpKfSessionWaitCaseList.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
