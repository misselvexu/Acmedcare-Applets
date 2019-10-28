package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class CashCardCreateRequest extends CardCreateRequest implements Serializable {
  @SerializedName("card_type")
  private String cardType = "CASH";

  private CashCard cash;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
