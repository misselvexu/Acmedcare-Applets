package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.result;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpKfSessionGetResult implements Serializable {
  private static final long serialVersionUID = 8474846575200033152L;

  /** kf_account 正在接待的客服，为空表示没有人在接待 */
  @SerializedName("kf_account")
  private String kfAccount;

  /** createtime 会话接入的时间 ，UNIX时间戳 */
  @SerializedName("createtime")
  private long createTime;

  public static WxMpKfSessionGetResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpKfSessionGetResult.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
