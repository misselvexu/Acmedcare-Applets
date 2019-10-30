package com.acmedcare.framework.applet.integrate.wechat.support.mp.enums;

import lombok.Getter;

/**
 *
 *
 * <pre>
 * ticket类型枚举
 * Created by Acmedcare+ Developer on 2018/11/18.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Getter
public enum TicketType {
  /** jsapi */
  JSAPI("jsapi"),
  /** sdk */
  SDK("2"),
  /** 微信卡券 */
  WX_CARD("wx_card");
  /** type代码 */
  private String code;

  TicketType(String code) {
    this.code = code;
  }
}
