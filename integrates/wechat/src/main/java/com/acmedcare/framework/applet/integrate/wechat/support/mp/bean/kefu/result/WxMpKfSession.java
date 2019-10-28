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
public class WxMpKfSession implements Serializable {
  private static final long serialVersionUID = 7804332813164994062L;

  /** kf_account 正在接待的客服，为空表示没有人在接待 */
  @SerializedName("kf_account")
  private String kfAccount;

  /** createtime 会话接入的时间，UNIX时间戳 该返回值 存在于 获取客服会话列表接口 */
  @SerializedName("createtime")
  private long createTime;

  /** latest_time 粉丝的最后一条消息的时间，UNIX时间戳 该返回值 存在于 获取未接入会话列表接口 */
  @SerializedName("latest_time")
  private long latestTime;

  /** openid 客户openid */
  @SerializedName("openid")
  private String openid;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
