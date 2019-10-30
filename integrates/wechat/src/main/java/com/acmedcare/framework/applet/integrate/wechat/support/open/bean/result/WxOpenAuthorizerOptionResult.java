package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result;

import lombok.Data;

import java.io.Serializable;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
@Data
public class WxOpenAuthorizerOptionResult implements Serializable {
  private static final long serialVersionUID = 4477837353654658179L;

  String authorizerAppid;
  String optionName;
  String optionValue;
}
