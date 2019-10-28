package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpDeviceService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.device.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by keungtung on 10/12/2016.
 *
 * @author keungtung
 */
@Slf4j
@RequiredArgsConstructor
public class WxMpDeviceServiceImpl implements WxMpDeviceService {
  private final WxMpService wxMpService;

  @Override
  public TransMsgResp transMsg(WxDeviceMsg msg) throws WxErrorException {
    String response = this.wxMpService.post(WxMpApiUrl.Device.DEVICE_TRANSMSG, msg.toJson());
    return TransMsgResp.fromJson(response);
  }

  @Override
  public WxDeviceQrCodeResult getQrCode(String productId) throws WxErrorException {
    String response =
        this.wxMpService.get(WxMpApiUrl.Device.DEVICE_GETQRCODE, "product_id=" + productId);
    return WxDeviceQrCodeResult.fromJson(response);
  }

  @Override
  public WxDeviceAuthorizeResult authorize(WxDeviceAuthorize wxDeviceAuthorize)
      throws WxErrorException {
    String response =
        this.wxMpService.post(
            WxMpApiUrl.Device.DEVICE_AUTHORIZE_DEVICE, wxDeviceAuthorize.toJson());
    return WxDeviceAuthorizeResult.fromJson(response);
  }

  @Override
  public WxDeviceBindResult bind(WxDeviceBind wxDeviceBind) throws WxErrorException {
    String response = this.wxMpService.post(WxMpApiUrl.Device.DEVICE_BIND, wxDeviceBind.toJson());
    return WxDeviceBindResult.fromJson(response);
  }

  @Override
  public WxDeviceBindResult compelBind(WxDeviceBind wxDeviceBind) throws WxErrorException {
    String response =
        this.wxMpService.post(WxMpApiUrl.Device.DEVICE_COMPEL_BIND, wxDeviceBind.toJson());
    return WxDeviceBindResult.fromJson(response);
  }

  @Override
  public WxDeviceBindResult unbind(WxDeviceBind wxDeviceBind) throws WxErrorException {
    String response = this.wxMpService.post(WxMpApiUrl.Device.DEVICE_UNBIND, wxDeviceBind.toJson());
    return WxDeviceBindResult.fromJson(response);
  }

  @Override
  public WxDeviceBindResult compelUnbind(WxDeviceBind wxDeviceBind) throws WxErrorException {
    String response =
        this.wxMpService.post(WxMpApiUrl.Device.DEVICE_COMPEL_UNBIND, wxDeviceBind.toJson());
    return WxDeviceBindResult.fromJson(response);
  }

  @Override
  public WxDeviceOpenIdResult getOpenId(String deviceType, String deviceId)
      throws WxErrorException {
    String response =
        this.wxMpService.get(
            WxMpApiUrl.Device.DEVICE_GET_OPENID,
            "device_type=" + deviceType + "&device_id=" + deviceId);
    return WxDeviceOpenIdResult.fromJson(response);
  }

  @Override
  public WxDeviceBindDeviceResult getBindDevice(String openId) throws WxErrorException {
    String response =
        this.wxMpService.get(WxMpApiUrl.Device.DEVICE_GET_BIND_DEVICE, "openid=" + openId);
    return WxDeviceBindDeviceResult.fromJson(response);
  }
}
