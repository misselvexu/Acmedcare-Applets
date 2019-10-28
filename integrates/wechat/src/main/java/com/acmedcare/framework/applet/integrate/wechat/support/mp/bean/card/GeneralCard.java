package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * .
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class GeneralCard extends Card implements Serializable {
  private static final long serialVersionUID = -1577656733441132585L;

  /** 兑换券专用，填写兑换内容的名称。 */
  @SerializedName("default_detail")
  private String defaultDetail;

  public static GeneralCard fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, GeneralCard.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
