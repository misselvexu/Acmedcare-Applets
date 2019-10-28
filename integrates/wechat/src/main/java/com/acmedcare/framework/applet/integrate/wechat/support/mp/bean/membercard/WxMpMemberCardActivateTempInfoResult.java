package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.membercard;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

/**
 * @author thomas
 * @date 2019/4/26
 */
@Data
public class WxMpMemberCardActivateTempInfoResult {

  private String errorCode;

  private String errorMsg;

  private MemberCardUserInfo userInfo;

  public static WxMpMemberCardActivateTempInfoResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpMemberCardActivateTempInfoResult.class);
  }
}
