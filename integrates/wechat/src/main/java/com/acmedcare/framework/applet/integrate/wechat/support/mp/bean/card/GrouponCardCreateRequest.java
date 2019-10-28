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
public class GrouponCardCreateRequest extends CardCreateRequest implements Serializable {
  private static final long serialVersionUID = 7551441058859934512L;

  @SerializedName("card_type")
  private String cardType = "GROUPON";

  private GrouponCard groupon;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
