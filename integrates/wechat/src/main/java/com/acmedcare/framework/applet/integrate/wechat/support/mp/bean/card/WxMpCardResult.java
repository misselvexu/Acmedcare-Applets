package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * 卡券查询Code，核销Code接口返回结果
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @version 15/11/11
 */
@Data
public class WxMpCardResult implements Serializable {
  private static final long serialVersionUID = -7950878428289035637L;

  private String errorCode;

  private String errorMsg;

  private String openId;

  private WxMpCard card;

  private String userCardStatus;

  private Boolean canConsume;

  private String outStr;

  private String backgroundPicUrl;

  private String unionid;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
