package com.acmedcare.framework.applet.integrate.wechat.support.open.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpMessageRouter;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message.WxMpXmlMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.message.WxMpXmlOutMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenService;

import java.util.HashMap;
import java.util.Map;

public class WxOpenMessageRouter extends WxMpMessageRouter {
  private WxOpenService wxOpenService;

  public WxOpenMessageRouter(WxOpenService wxOpenService) {
    super(null);
    this.wxOpenService = wxOpenService;
  }

  public WxMpXmlOutMessage route(final WxMpXmlMessage wxMessage, String appId) {
    return route(wxMessage, new HashMap<String, Object>(), appId);
  }

  public WxMpXmlOutMessage route(
      final WxMpXmlMessage wxMessage, final Map<String, Object> context, String appId) {
    return route(
        wxMessage, context, wxOpenService.getWxOpenComponentService().getWxMpServiceByAppid(appId));
  }
}
