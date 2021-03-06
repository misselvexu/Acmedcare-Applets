package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.marketing;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
@Data
public class WxMpAdLeadInfo implements Serializable {
  private static final long serialVersionUID = -6462312242780350479L;

  @SerializedName("key")
  private String key;

  @SerializedName("value")
  private String value;
}
