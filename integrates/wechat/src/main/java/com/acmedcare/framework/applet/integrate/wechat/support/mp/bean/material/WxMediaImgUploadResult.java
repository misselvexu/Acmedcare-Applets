package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/** @author miller */
@Data
public class WxMediaImgUploadResult implements Serializable {
  private static final long serialVersionUID = 1996392453428768829L;
  private String url;

  public static WxMediaImgUploadResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMediaImgUploadResult.class);
  }
}
