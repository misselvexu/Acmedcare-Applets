package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
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
public final class DiscountCard extends Card implements Serializable {
  private static final long serialVersionUID = 1704610082472315077L;

  /** 折扣券专用，表示打折额度（百分比）。填30就是七折。 */
  private int discount;

  public static DiscountCard fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, DiscountCard.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
