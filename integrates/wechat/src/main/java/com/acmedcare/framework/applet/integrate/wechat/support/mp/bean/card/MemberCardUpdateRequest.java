package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 更新会员卡请求对象.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class MemberCardUpdateRequest implements Serializable {
  private static final long serialVersionUID = -1025759626161614466L;

  @SerializedName("card_id")
  private String cardId;

  @SerializedName("member_card")
  private MemberCardUpdate memberCardUpdate;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
