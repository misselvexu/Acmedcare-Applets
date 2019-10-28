package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpWifiService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.wifi.WxMpWifiShopDataResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.wifi.WxMpWifiShopListResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;

/**
 *
 *
 * <pre>
 *  Created by BinaryWang on 2018/6/10.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@RequiredArgsConstructor
public class WxMpWifiServiceImpl implements WxMpWifiService {
  private final WxMpService wxMpService;

  @Override
  public WxMpWifiShopListResult listShop(int pageIndex, int pageSize) throws WxErrorException {
    JsonObject json = new JsonObject();
    json.addProperty("pageindex", pageIndex);
    json.addProperty("pagesize", pageSize);
    final String result = this.wxMpService.post(WxMpApiUrl.Wifi.BIZWIFI_SHOP_LIST, json.toString());
    return WxMpWifiShopListResult.fromJson(result);
  }

  @Override
  public WxMpWifiShopDataResult getShopWifiInfo(int shopId) throws WxErrorException {
    JsonObject json = new JsonObject();
    json.addProperty("shop_id", shopId);
    return WxMpWifiShopDataResult.fromJson(
        this.wxMpService.post(WxMpApiUrl.Wifi.BIZWIFI_SHOP_GET, json.toString()));
  }

  @Override
  public boolean updateShopWifiInfo(int shopId, String oldSsid, String ssid, String password)
      throws WxErrorException {
    JsonObject json = new JsonObject();
    json.addProperty("shop_id", shopId);
    json.addProperty("old_ssid", oldSsid);
    json.addProperty("ssid", ssid);
    if (password != null) {
      json.addProperty("password", password);
    }
    try {
      this.wxMpService.post(WxMpApiUrl.Wifi.BIZWIFI_SHOP_UPDATE, json.toString());
      return true;
    } catch (WxErrorException e) {
      throw e;
    }
  }
}
