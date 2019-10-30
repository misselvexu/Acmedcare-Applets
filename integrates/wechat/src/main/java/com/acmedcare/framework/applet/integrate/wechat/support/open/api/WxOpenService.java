package com.acmedcare.framework.applet.integrate.wechat.support.open.api;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public interface WxOpenService {
  WxOpenComponentService getWxOpenComponentService();

  WxOpenConfigStorage getWxOpenConfigStorage();

  void setWxOpenConfigStorage(WxOpenConfigStorage wxOpenConfigStorage);

  /** 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的GET请求 */
  String get(String url, String queryParam) throws WxErrorException;

  /** 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的POST请求 */
  String post(String url, String postData) throws WxErrorException;
}
