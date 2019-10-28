package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpShakeService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.WxMpShakeInfoResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.WxMpShakeQuery;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.shake.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import lombok.RequiredArgsConstructor;

/**
 * Created by rememberber on 2017/6/5.
 *
 * @author rememberber
 */
@RequiredArgsConstructor
public class WxMpShakeServiceImpl implements WxMpShakeService {
  private final WxMpService wxMpService;

  @Override
  public WxMpShakeInfoResult getShakeInfo(WxMpShakeQuery wxMpShakeQuery) throws WxErrorException {
    String postData = wxMpShakeQuery.toJsonString();
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.ShakeAround.SHAKEAROUND_USER_GETSHAKEINFO, postData);
    return WxMpShakeInfoResult.fromJson(responseContent);
  }

  @Override
  public WxMpShakeAroundPageAddResult pageAdd(WxMpShakeAroundPageAddQuery shakeAroundPageAddQuery)
      throws WxErrorException {
    String postData = shakeAroundPageAddQuery.toJsonString();
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.ShakeAround.SHAKEAROUND_PAGE_ADD, postData);
    return WxMpShakeAroundPageAddResult.fromJson(responseContent);
  }

  @Override
  public WxError deviceBindPageQuery(
      WxMpShakeAroundDeviceBindPageQuery shakeAroundDeviceBindPageQuery) throws WxErrorException {
    String postData = shakeAroundDeviceBindPageQuery.toJsonString();
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.ShakeAround.SHAKEAROUND_DEVICE_BINDPAGE, postData);
    return WxError.fromJson(responseContent, WxType.MP);
  }

  @Override
  public WxMpShakeAroundRelationSearchResult relationSearch(
      WxMpShakeAroundRelationSearchQuery searchQuery) throws WxErrorException {
    String postData = searchQuery.toJsonString();
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.ShakeAround.SHAKEAROUND_RELATION_SEARCH, postData);
    return WxMpShakeAroundRelationSearchResult.fromJson(responseContent);
  }
}
