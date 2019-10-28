package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import java.io.Serializable;

/**
 * 卡券返回结果基础类
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class BaseWxMpCardResult implements Serializable {

  /** 错误码 */
  private Integer errcode;

  /** 错误信息 */
  private String errmsg;

  public boolean isSuccess() {
    return 0 == errcode;
  }
}
