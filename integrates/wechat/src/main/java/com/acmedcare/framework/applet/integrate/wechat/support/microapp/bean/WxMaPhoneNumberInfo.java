package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json.WxMaGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * 微信用户绑定的手机号相关信息
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMaPhoneNumberInfo implements Serializable {
  private static final long serialVersionUID = 6719822331555402137L;

  private String phoneNumber;
  private String purePhoneNumber;
  private String countryCode;
  private Watermark watermark;

  public static WxMaPhoneNumberInfo fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json, WxMaPhoneNumberInfo.class);
  }

  @Data
  public static class Watermark {
    private String timestamp;
    private String appid;
  }
}
