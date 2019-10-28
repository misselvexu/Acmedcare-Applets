package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品信息.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class Sku implements Serializable {

  /** 卡券库存的数量,不支持填写0，上限为100000000。 */
  @SerializedName("quantity")
  private Integer quantity = 100000000;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
