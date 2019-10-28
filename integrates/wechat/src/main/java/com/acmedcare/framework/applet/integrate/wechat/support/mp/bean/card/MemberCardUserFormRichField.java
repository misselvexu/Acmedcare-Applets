package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card.enums.CardRichFieldType;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 富文本字段.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2018-08-30
 */
@Data
public class MemberCardUserFormRichField {

  /** 富文本类型 */
  @SerializedName("type")
  private CardRichFieldType type;

  @SerializedName("name")
  private String name;

  @SerializedName("values")
  private List<String> valueList;

  public void add(String value) {
    if (valueList == null) {
      valueList = new ArrayList<String>();
    }
    valueList.add(value);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
