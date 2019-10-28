package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.SimplePostRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpUserBlacklistService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpUserBlacklistGetResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** @author miller */
@RequiredArgsConstructor
public class WxMpUserBlacklistServiceImpl implements WxMpUserBlacklistService {
  private final WxMpService wxMpService;

  @Override
  public WxMpUserBlacklistGetResult getBlacklist(String nextOpenid) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("begin_openid", nextOpenid);
    String responseContent =
        this.wxMpService.execute(
            SimplePostRequestExecutor.create(this.wxMpService.getRequestHttp()),
            WxMpApiUrl.UserBlacklist.GETBLACKLIST,
            jsonObject.toString());
    return WxMpUserBlacklistGetResult.fromJson(responseContent);
  }

  @Override
  public void pushToBlacklist(List<String> openidList) throws WxErrorException {
    Map<String, Object> map = new HashMap<>(2);
    map.put("openid_list", openidList);
    this.wxMpService.execute(
        SimplePostRequestExecutor.create(this.wxMpService.getRequestHttp()),
        WxMpApiUrl.UserBlacklist.BATCHBLACKLIST,
        WxMpGsonBuilder.create().toJson(map));
  }

  @Override
  public void pullFromBlacklist(List<String> openidList) throws WxErrorException {
    Map<String, Object> map = new HashMap<>(2);
    map.put("openid_list", openidList);
    this.wxMpService.execute(
        SimplePostRequestExecutor.create(this.wxMpService.getRequestHttp()),
        WxMpApiUrl.UserBlacklist.BATCHUNBLACKLIST,
        WxMpGsonBuilder.create().toJson(map));
  }
}
