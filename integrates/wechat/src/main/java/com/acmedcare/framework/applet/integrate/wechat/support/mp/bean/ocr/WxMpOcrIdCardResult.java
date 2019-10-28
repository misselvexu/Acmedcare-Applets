package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.ocr;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * OCR身份证识别结果.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2019-06-23
 */
@Data
public class WxMpOcrIdCardResult implements Serializable {
  private static final long serialVersionUID = 8184352486986729980L;

  @SerializedName("type")
  private String type;

  @SerializedName("name")
  private String name;

  @SerializedName("id")
  private String id;

  @SerializedName("valid_date")
  private String validDate;

  public static WxMpOcrIdCardResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpOcrIdCardResult.class);
  }
}
