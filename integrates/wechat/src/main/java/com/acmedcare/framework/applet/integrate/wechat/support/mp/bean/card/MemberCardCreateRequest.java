package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 创建会员卡请求对象.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class MemberCardCreateRequest implements Serializable {
  private static final long serialVersionUID = -1044836608401698097L;

  @SerializedName("card_type")
  private String cardType = "MEMBER_CARD";

  @SerializedName("member_card")
  private MemberCard memberCard;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
