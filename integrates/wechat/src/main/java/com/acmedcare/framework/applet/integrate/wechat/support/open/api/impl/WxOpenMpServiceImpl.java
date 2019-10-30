package com.acmedcare.framework.applet.integrate.wechat.support.open.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl.WxMpServiceImpl;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpOAuth2AccessToken;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.config.WxMpConfigStorage;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenComponentService;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenMpServiceImpl extends WxMpServiceImpl {
  private WxOpenComponentService wxOpenComponentService;
  private WxMpConfigStorage wxMpConfigStorage;
  private String appId;

  public WxOpenMpServiceImpl(
      WxOpenComponentService wxOpenComponentService,
      String appId,
      WxMpConfigStorage wxMpConfigStorage) {
    this.wxOpenComponentService = wxOpenComponentService;
    this.appId = appId;
    this.wxMpConfigStorage = wxMpConfigStorage;
    initHttp();
  }

  @Override
  public WxMpConfigStorage getWxMpConfigStorage() {
    return wxMpConfigStorage;
  }

  @Override
  public String getAccessToken(boolean forceRefresh) throws WxErrorException {
    return wxOpenComponentService.getAuthorizerAccessToken(appId, forceRefresh);
  }

  @Override
  public WxMpOAuth2AccessToken oauth2getAccessToken(String code) throws WxErrorException {
    return wxOpenComponentService.oauth2getAccessToken(appId, code);
  }

  @Override
  public WxMpOAuth2AccessToken oauth2refreshAccessToken(String refreshToken)
      throws WxErrorException {
    return wxOpenComponentService.oauth2refreshAccessToken(appId, refreshToken);
  }

  @Override
  public String oauth2buildAuthorizationUrl(String redirectURI, String scope, String state) {
    return wxOpenComponentService.oauth2buildAuthorizationUrl(appId, redirectURI, scope, state);
  }
}
