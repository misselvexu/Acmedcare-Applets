package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaShareService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaShareInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.crypt.WxMaCryptUtils;

/** @author zhfish */
public class WxMaShareServiceImpl implements WxMaShareService {
  private WxMaService service;

  public WxMaShareServiceImpl(WxMaService service) {
    this.service = service;
  }

  @Override
  public WxMaShareInfo getShareInfo(String sessionKey, String encryptedData, String ivStr) {
    return WxMaShareInfo.fromJson(WxMaCryptUtils.decrypt(sessionKey, encryptedData, ivStr));
  }
}
