package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpMassMessageService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpMassSendResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpMassUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 *
 *
 * <pre>
 * 群发消息服务类
 * Created by Acmedcare+ Developer on 2017-8-16.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Slf4j
@RequiredArgsConstructor
public class WxMpMassMessageServiceImpl implements WxMpMassMessageService {
  private final WxMpService wxMpService;

  @Override
  public WxMpMassUploadResult massNewsUpload(WxMpMassNews news) throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.MassMessage.MEDIA_UPLOAD_NEWS_URL, news.toJson());
    return WxMpMassUploadResult.fromJson(responseContent);
  }

  @Override
  public WxMpMassUploadResult massVideoUpload(WxMpMassVideo video) throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.MassMessage.MEDIA_UPLOAD_VIDEO_URL, video.toJson());
    return WxMpMassUploadResult.fromJson(responseContent);
  }

  @Override
  public WxMpMassSendResult massGroupMessageSend(WxMpMassTagMessage message)
      throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.MassMessage.MESSAGE_MASS_SENDALL_URL, message.toJson());
    return WxMpMassSendResult.fromJson(responseContent);
  }

  @Override
  public WxMpMassSendResult massOpenIdsMessageSend(WxMpMassOpenIdsMessage message)
      throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.MassMessage.MESSAGE_MASS_SEND_URL, message.toJson());
    return WxMpMassSendResult.fromJson(responseContent);
  }

  @Override
  public WxMpMassSendResult massMessagePreview(WxMpMassPreviewMessage wxMpMassPreviewMessage)
      throws WxErrorException {
    String responseContent =
        this.wxMpService.post(
            WxMpApiUrl.MassMessage.MESSAGE_MASS_PREVIEW_URL, wxMpMassPreviewMessage.toJson());
    return WxMpMassSendResult.fromJson(responseContent);
  }

  @Override
  public void delete(Long msgId, Integer articleIndex) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("msg_id", msgId);
    jsonObject.addProperty("article_idx", articleIndex);
    this.wxMpService.post(WxMpApiUrl.MassMessage.MESSAGE_MASS_DELETE_URL, jsonObject.toString());
  }
}
