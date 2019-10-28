package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 支付功能.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class PayInfo implements Serializable {

  /** 刷卡功能 */
  @SerializedName("swipe_card")
  private SwipeCard swipeCard;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
