package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaMsgService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaTemplateMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaUniformMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.constant.WxMaConstants;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaMsgServiceImpl implements WxMaMsgService {
  private static final JsonParser JSON_PARSER = new JsonParser();
  private WxMaService wxMaService;

  public WxMaMsgServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }

  @Override
  public boolean sendKefuMsg(WxMaKefuMessage message) throws WxErrorException {
    String responseContent = this.wxMaService.post(KEFU_MESSAGE_SEND_URL, message.toJson());
    return responseContent != null;
  }

  @Override
  public void sendTemplateMsg(WxMaTemplateMessage templateMessage) throws WxErrorException {
    String responseContent = this.wxMaService.post(TEMPLATE_MSG_SEND_URL, templateMessage.toJson());
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get(WxMaConstants.ERRCODE).getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent));
    }
  }

  @Override
  public void sendUniformMsg(WxMaUniformMessage uniformMessage) throws WxErrorException {
    String responseContent = this.wxMaService.post(UNIFORM_MSG_SEND_URL, uniformMessage.toJson());
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get(WxMaConstants.ERRCODE).getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent));
    }
  }
}
