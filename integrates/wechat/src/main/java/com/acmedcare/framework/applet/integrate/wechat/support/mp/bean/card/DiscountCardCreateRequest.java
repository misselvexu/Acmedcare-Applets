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
public class DiscountCardCreateRequest extends CardCreateRequest implements Serializable {
  private static final long serialVersionUID = 1190518086576489692L;

  @SerializedName("card_type")
  private String cardType = "DISCOUNT";

  private DiscountCard discount;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
