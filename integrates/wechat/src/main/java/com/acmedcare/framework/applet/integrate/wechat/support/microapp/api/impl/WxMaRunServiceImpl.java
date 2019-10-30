package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaRunService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaRunStepInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.crypt.WxMaCryptUtils;

import java.util.List;

/**
 *
 *
 * <pre>
 *
 * Created by Acmedcare+ Developer on 2018/11/4.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaRunServiceImpl implements WxMaRunService {
  private WxMaService service;

  public WxMaRunServiceImpl(WxMaService service) {
    this.service = service;
  }

  @Override
  public List<WxMaRunStepInfo> getRunStepInfo(
      String sessionKey, String encryptedData, String ivStr) {
    return WxMaRunStepInfo.fromJson(WxMaCryptUtils.decrypt(sessionKey, encryptedData, ivStr));
  }
}
