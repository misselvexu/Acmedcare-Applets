package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.result.WxMediaUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.MediaUploadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpKefuService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.WxMpKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.request.WxMpKfAccountRequest;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.request.WxMpKfSessionRequest;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.result.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.Date;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Slf4j
@RequiredArgsConstructor
public class WxMpKefuServiceImpl implements WxMpKefuService {
  private final WxMpService wxMpService;

  @Override
  public boolean sendKefuMessage(WxMpKefuMessage message) throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.MESSAGE_CUSTOM_SEND, message.toJson());
    return responseContent != null;
  }

  @Override
  public WxMpKfList kfList() throws WxErrorException {
    String responseContent = this.wxMpService.get(WxMpApiUrl.Kefu.GET_KF_LIST, null);
    return WxMpKfList.fromJson(responseContent);
  }

  @Override
  public WxMpKfOnlineList kfOnlineList() throws WxErrorException {
    String responseContent = this.wxMpService.get(WxMpApiUrl.Kefu.GET_ONLINE_KF_LIST, null);
    return WxMpKfOnlineList.fromJson(responseContent);
  }

  @Override
  public boolean kfAccountAdd(WxMpKfAccountRequest request) throws WxErrorException {
    String responseContent = this.wxMpService.post(WxMpApiUrl.Kefu.KFACCOUNT_ADD, request.toJson());
    return responseContent != null;
  }

  @Override
  public boolean kfAccountUpdate(WxMpKfAccountRequest request) throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.KFACCOUNT_UPDATE, request.toJson());
    return responseContent != null;
  }

  @Override
  public boolean kfAccountInviteWorker(WxMpKfAccountRequest request) throws WxErrorException {
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.KFACCOUNT_INVITE_WORKER, request.toJson());
    return responseContent != null;
  }

  @Override
  public boolean kfAccountUploadHeadImg(String kfAccount, File imgFile) throws WxErrorException {
    WxMediaUploadResult responseContent =
        this.wxMpService.execute(
            MediaUploadRequestExecutor.create(this.wxMpService.getRequestHttp()),
            String.format(
                WxMpApiUrl.Kefu.KFACCOUNT_UPLOAD_HEAD_IMG.getUrl(
                    this.wxMpService.getWxMpConfigStorage()),
                kfAccount),
            imgFile);
    return responseContent != null;
  }

  @Override
  public boolean kfAccountDel(String kfAccount) throws WxErrorException {
    String responseContent =
        this.wxMpService.get(
            String.format(
                WxMpApiUrl.Kefu.KFACCOUNT_DEL.getUrl(this.wxMpService.getWxMpConfigStorage()),
                kfAccount),
            null);
    return responseContent != null;
  }

  @Override
  public boolean kfSessionCreate(String openid, String kfAccount) throws WxErrorException {
    WxMpKfSessionRequest request = new WxMpKfSessionRequest(kfAccount, openid);
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.KFSESSION_CREATE, request.toJson());
    return responseContent != null;
  }

  @Override
  public boolean kfSessionClose(String openid, String kfAccount) throws WxErrorException {
    WxMpKfSessionRequest request = new WxMpKfSessionRequest(kfAccount, openid);
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.KFSESSION_CLOSE, request.toJson());
    return responseContent != null;
  }

  @Override
  public WxMpKfSessionGetResult kfSessionGet(String openid) throws WxErrorException {
    String responseContent =
        this.wxMpService.get(
            String.format(
                WxMpApiUrl.Kefu.KFSESSION_GET_SESSION.getUrl(
                    this.wxMpService.getWxMpConfigStorage()),
                openid),
            null);
    return WxMpKfSessionGetResult.fromJson(responseContent);
  }

  @Override
  public WxMpKfSessionList kfSessionList(String kfAccount) throws WxErrorException {
    String responseContent =
        this.wxMpService.get(
            String.format(
                WxMpApiUrl.Kefu.KFSESSION_GET_SESSION_LIST.getUrl(
                    this.wxMpService.getWxMpConfigStorage()),
                kfAccount),
            null);
    return WxMpKfSessionList.fromJson(responseContent);
  }

  @Override
  public WxMpKfSessionWaitCaseList kfSessionGetWaitCase() throws WxErrorException {
    String responseContent = this.wxMpService.get(WxMpApiUrl.Kefu.KFSESSION_GET_WAIT_CASE, null);
    return WxMpKfSessionWaitCaseList.fromJson(responseContent);
  }

  @Override
  public WxMpKfMsgList kfMsgList(Date startTime, Date endTime, Long msgId, Integer number)
      throws WxErrorException {
    if (number > 10000) {
      throw new WxErrorException(
          WxError.builder().errorCode(-1).errorMsg("非法参数请求，每次最多查询10000条记录！").build());
    }

    if (startTime.after(endTime)) {
      throw new WxErrorException(WxError.builder().errorCode(-1).errorMsg("起始时间不能晚于结束时间！").build());
    }

    JsonObject param = new JsonObject();
    param.addProperty("starttime", startTime.getTime() / 1000);
    param.addProperty("endtime", endTime.getTime() / 1000);
    param.addProperty("msgid", msgId);
    param.addProperty("number", number);

    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.MSG_RECORD_LIST, param.toString());

    return WxMpKfMsgList.fromJson(responseContent);
  }

  @Override
  public WxMpKfMsgList kfMsgList(Date startTime, Date endTime) throws WxErrorException {
    int number = 10000;
    WxMpKfMsgList result = this.kfMsgList(startTime, endTime, 1L, number);

    if (result != null && result.getNumber() == number) {
      Long msgId = result.getMsgId();
      WxMpKfMsgList followingResult = this.kfMsgList(startTime, endTime, msgId, number);
      while (followingResult != null && followingResult.getRecords().size() > 0) {
        result.getRecords().addAll(followingResult.getRecords());
        result.setNumber(result.getNumber() + followingResult.getNumber());
        result.setMsgId(followingResult.getMsgId());
        followingResult = this.kfMsgList(startTime, endTime, followingResult.getMsgId(), number);
      }
    }

    return result;
  }

  @Override
  public boolean sendKfTypingState(String openid, String command) throws WxErrorException {
    JsonObject params = new JsonObject();
    params.addProperty("touser", openid);
    params.addProperty("command", command);
    String responseContent =
        this.wxMpService.post(WxMpApiUrl.Kefu.CUSTOM_TYPING, params.toString());
    return responseContent != null;
  }
}
