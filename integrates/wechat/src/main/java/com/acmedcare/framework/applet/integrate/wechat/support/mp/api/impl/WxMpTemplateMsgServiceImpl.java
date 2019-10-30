package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpTemplateMsgService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.template.WxMpTemplate;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.template.WxMpTemplateIndustry;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.template.WxMpTemplateMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 *
 *
 * <pre>
 * Created by Acmedcare+ Developer on 2016-10-14.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@RequiredArgsConstructor
public class WxMpTemplateMsgServiceImpl implements WxMpTemplateMsgService {
  private static final JsonParser JSON_PARSER = new JsonParser();

  private final WxMpService wxMpService;

  @Override
  public String sendTemplateMsg(WxMpTemplateMessage templateMessage) throws WxErrorException {
    String responseContent =
        this.wxMpService.post(
            WxMpApiUrl.TemplateMsg.MESSAGE_TEMPLATE_SEND, templateMessage.toJson());
    final JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get("errcode").getAsInt() == 0) {
      return jsonObject.get("msgid").getAsString();
    }
    throw new WxErrorException(WxError.fromJson(responseContent, WxType.MP));
  }

  @Override
  public boolean setIndustry(WxMpTemplateIndustry wxMpIndustry) throws WxErrorException {
    if (null == wxMpIndustry.getPrimaryIndustry()
        || null == wxMpIndustry.getPrimaryIndustry().getId()
        || null == wxMpIndustry.getSecondIndustry()
        || null == wxMpIndustry.getSecondIndustry().getId()) {
      throw new IllegalArgumentException("行业Id不能为空，请核实");
    }

    this.wxMpService.post(WxMpApiUrl.TemplateMsg.TEMPLATE_API_SET_INDUSTRY, wxMpIndustry.toJson());
    return true;
  }

  @Override
  public WxMpTemplateIndustry getIndustry() throws WxErrorException {
    String responseContent =
        this.wxMpService.get(WxMpApiUrl.TemplateMsg.TEMPLATE_GET_INDUSTRY, null);
    return WxMpTemplateIndustry.fromJson(responseContent);
  }

  @Override
  public String addTemplate(String shortTemplateId) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("template_id_short", shortTemplateId);
    String responseContent =
        this.wxMpService.post(
            WxMpApiUrl.TemplateMsg.TEMPLATE_API_ADD_TEMPLATE, jsonObject.toString());
    final JsonObject result = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (result.get("errcode").getAsInt() == 0) {
      return result.get("template_id").getAsString();
    }

    throw new WxErrorException(WxError.fromJson(responseContent, WxType.MP));
  }

  @Override
  public List<WxMpTemplate> getAllPrivateTemplate() throws WxErrorException {
    return WxMpTemplate.fromJson(
        this.wxMpService.get(WxMpApiUrl.TemplateMsg.TEMPLATE_GET_ALL_PRIVATE_TEMPLATE, null));
  }

  @Override
  public boolean delPrivateTemplate(String templateId) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("template_id", templateId);
    String responseContent =
        this.wxMpService.post(
            WxMpApiUrl.TemplateMsg.TEMPLATE_DEL_PRIVATE_TEMPLATE, jsonObject.toString());
    WxError error = WxError.fromJson(responseContent, WxType.MP);
    if (error.getErrorCode() == 0) {
      return true;
    }

    throw new WxErrorException(error);
  }
}
