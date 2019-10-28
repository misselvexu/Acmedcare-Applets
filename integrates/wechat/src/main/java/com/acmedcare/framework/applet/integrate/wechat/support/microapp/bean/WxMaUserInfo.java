package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json.WxMaGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMaUserInfo implements Serializable {
  private static final long serialVersionUID = 6719822331555402137L;

  private String openId;
  private String nickName;
  private String gender;
  private String language;
  private String city;
  private String province;
  private String country;
  private String avatarUrl;
  private String unionId;
  private Watermark watermark;

  public static WxMaUserInfo fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json, WxMaUserInfo.class);
  }

  @Data
  public static class Watermark {
    private String timestamp;
    private String appid;
  }
}
