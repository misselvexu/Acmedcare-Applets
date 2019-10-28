package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * .
 *
 * @author leeis @Date 2018/12/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class CashCard extends Card implements Serializable {
  private static final long serialVersionUID = 6965491956462769745L;

  /** 代金券专用，表示起用金额（单位为分）,如果无起用门槛则填0 */
  @SerializedName("least_cost")
  private int leastCost;

  /** 代金券专用，表示减免金额。（单位为分） */
  @SerializedName("reduce_cost")
  private int reduceCost;

  public static CashCard fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, CashCard.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
