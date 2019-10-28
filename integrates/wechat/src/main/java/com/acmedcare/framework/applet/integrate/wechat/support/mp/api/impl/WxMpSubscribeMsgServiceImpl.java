package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.URIUtil;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpSubscribeMsgService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.subscribe.WxMpSubscribeMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.config.WxMpConfigStorage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import lombok.RequiredArgsConstructor;

/**
 * 一次性订阅消息接口.
 *
 * @author Mklaus
 * @date 2018-01-22 上午11:19
 */
@RequiredArgsConstructor
public class WxMpSubscribeMsgServiceImpl implements WxMpSubscribeMsgService {
  private final WxMpService wxMpService;

  @Override
  public String subscribeMsgAuthorizationUrl(String redirectURI, int scene, String reserved) {
    WxMpConfigStorage storage = this.wxMpService.getWxMpConfigStorage();
    return String.format(
        WxMpApiUrl.SubscribeMsg.SUBSCRIBE_MESSAGE_AUTHORIZE_URL.getUrl(storage),
        storage.getAppId(),
        scene,
        storage.getTemplateId(),
        URIUtil.encodeURIComponent(redirectURI),
        reserved);
  }

  @Override
  public boolean sendSubscribeMessage(WxMpSubscribeMessage message) throws WxErrorException {
    if (message.getTemplateId() == null) {
      message.setTemplateId(this.wxMpService.getWxMpConfigStorage().getTemplateId());
    }

    String responseContent =
        this.wxMpService.post(WxMpApiUrl.SubscribeMsg.SEND_MESSAGE_URL, message.toJson());
    return responseContent != null;
  }
}
