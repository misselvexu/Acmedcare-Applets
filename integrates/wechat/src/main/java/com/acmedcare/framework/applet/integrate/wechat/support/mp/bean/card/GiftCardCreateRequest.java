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
public class GiftCardCreateRequest extends CardCreateRequest implements Serializable {
  private static final long serialVersionUID = 1283655452584811858L;

  @SerializedName("card_type")
  private String cardType = "GIFT";

  private GiftCard gift;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
