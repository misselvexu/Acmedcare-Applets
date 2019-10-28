package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaPluginService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaPluginListResult;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json.WxMaGsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class WxMaPluginServiceImpl implements WxMaPluginService {

  private WxMaService wxMaService;

  public WxMaPluginServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }

  @Override
  public void applyPlugin(String pluginAppId, String reason) throws WxErrorException {
    Map<String, String> params = new HashMap<>();
    params.put("action", "apply");
    params.put("plugin_appid", pluginAppId);
    params.put("reason", reason);

    this.wxMaService.post(PLUGIN_URL, WxMaGsonBuilder.create().toJson(params));
  }

  @Override
  public WxMaPluginListResult getPluginList() throws WxErrorException {
    Map<String, String> params = new HashMap<>();
    params.put("action", "list");

    String responseContent =
        this.wxMaService.post(PLUGIN_URL, WxMaGsonBuilder.create().toJson(params));
    return WxMaPluginListResult.fromJson(responseContent);
  }

  @Override
  public void unbindPlugin(String pluginAppId) throws WxErrorException {
    Map<String, String> params = new HashMap<>();
    params.put("action", "unbind");
    params.put("plugin_appid", pluginAppId);

    this.wxMaService.post(PLUGIN_URL, WxMaGsonBuilder.create().toJson(params));
  }

  @Override
  public void updatePlugin(String pluginAppId, String userVersion) throws WxErrorException {
    Map<String, String> params = new HashMap<>();
    params.put("action", "update");
    params.put("plugin_appid", pluginAppId);
    params.put("user_version", userVersion);

    this.wxMaService.post(PLUGIN_URL, WxMaGsonBuilder.create().toJson(params));
  }
}
