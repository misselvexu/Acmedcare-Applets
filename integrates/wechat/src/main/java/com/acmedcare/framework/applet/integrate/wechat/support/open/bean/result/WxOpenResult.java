package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result;

import com.acmedcare.framework.applet.integrate.wechat.support.open.util.json.WxOpenGsonBuilder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * 基础的微信开放平台请求结果.
 *
 * @author yqx
 * @date 2018/10/1
 */
@Data
public class WxOpenResult implements Serializable {
  private static final long serialVersionUID = 2101652152604850904L;
  protected String errcode;
  protected String errmsg;

  /** 请求是否成功. */
  public boolean isSuccess() {
    return StringUtils.equalsIgnoreCase(errcode, "0");
  }

  @Override
  public String toString() {
    return WxOpenGsonBuilder.create().toJson(this);
  }
}
