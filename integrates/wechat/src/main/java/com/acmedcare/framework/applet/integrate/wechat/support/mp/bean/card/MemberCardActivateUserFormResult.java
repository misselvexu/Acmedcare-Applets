package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

@Data
public class MemberCardActivateUserFormResult implements Serializable {
  private Integer errcode;
  private String errmsg;

  public static MemberCardActivateUserFormResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, MemberCardActivateUserFormResult.class);
  }

  public boolean isSuccess() {
    return 0 == errcode;
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
