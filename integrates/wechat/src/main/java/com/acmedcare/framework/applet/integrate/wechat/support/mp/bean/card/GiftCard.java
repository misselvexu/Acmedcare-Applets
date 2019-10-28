package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * .
 *
 * @author leeis @Date 2018/12/29
 */
@Data
public final class GiftCard extends Card implements Serializable {

  private static final long serialVersionUID = -6168739707511792266L;

  /** 兑换券专用，填写兑换内容的名称。 */
  private String gift;

  public static GiftCard fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, GiftCard.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
