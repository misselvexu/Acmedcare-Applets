package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * .
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpCardCreateResult implements Serializable {
  private static final long serialVersionUID = -128818731449449537L;

  @SerializedName("card_id")
  private String cardId;

  private Integer errcode;
  private String errmsg;

  public static WxMpCardCreateResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpCardCreateResult.class);
  }

  public static WxMpCardCreateResult failure(String errmsg) {
    WxMpCardCreateResult result = new WxMpCardCreateResult();
    result.setErrcode(500);
    result.setErrmsg(errmsg);
    return result;
  }

  public static WxMpCardCreateResult success() {
    WxMpCardCreateResult result = new WxMpCardCreateResult();
    result.setErrcode(0);
    result.setErrmsg("ok");
    return result;
  }

  public boolean isSuccess() {
    return 0 == errcode;
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
