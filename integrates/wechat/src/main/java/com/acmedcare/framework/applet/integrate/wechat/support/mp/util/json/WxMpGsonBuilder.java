package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card.WxMpCard;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card.WxMpCardResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.datacube.WxDataCubeUserCumulate;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.datacube.WxDataCubeUserSummary;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.kefu.WxMpKefuMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.membercard.WxMpMemberCardActivateTempInfoResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.membercard.WxMpMemberCardUpdateResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.membercard.WxMpMemberCardUserInfoResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.subscribe.WxMpSubscribeMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.template.WxMpTemplateIndustry;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.template.WxMpTemplateMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/** @author someone */
public class WxMpGsonBuilder {

  private static final GsonBuilder INSTANCE = new GsonBuilder();

  static {
    INSTANCE.disableHtmlEscaping();
    INSTANCE.registerTypeAdapter(WxMpKefuMessage.class, new WxMpKefuMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpMassNews.class, new WxMpMassNewsGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpMassTagMessage.class, new WxMpMassTagMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMassOpenIdsMessage.class, new WxMpMassOpenIdsMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpUser.class, new WxMpUserGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpChangeOpenid.class, new WxMpChangeOpenidGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpUserList.class, new WxUserListGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpMassVideo.class, new WxMpMassVideoAdapter());
    INSTANCE.registerTypeAdapter(WxMpMassSendResult.class, new WxMpMassSendResultAdapter());
    INSTANCE.registerTypeAdapter(WxMpMassUploadResult.class, new WxMpMassUploadResultAdapter());
    INSTANCE.registerTypeAdapter(WxMpQrCodeTicket.class, new WxQrCodeTicketAdapter());
    INSTANCE.registerTypeAdapter(WxMpTemplateMessage.class, new WxMpTemplateMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpSubscribeMessage.class, new WxMpSubscribeMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpSemanticQueryResult.class, new WxMpSemanticQueryResultAdapter());
    INSTANCE.registerTypeAdapter(WxMpOAuth2AccessToken.class, new WxMpOAuth2AccessTokenAdapter());
    INSTANCE.registerTypeAdapter(WxDataCubeUserSummary.class, new WxMpUserSummaryGsonAdapter());
    INSTANCE.registerTypeAdapter(WxDataCubeUserCumulate.class, new WxMpUserCumulateGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialUploadResult.class, new WxMpMaterialUploadResultAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialVideoInfoResult.class, new WxMpMaterialVideoInfoResultAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMassNews.WxMpMassNewsArticle.class, new WxMpMassNewsArticleGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialArticleUpdate.class, new WxMpMaterialArticleUpdateGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialCountResult.class, new WxMpMaterialCountResultAdapter());
    INSTANCE.registerTypeAdapter(WxMpMaterialNews.class, new WxMpMaterialNewsGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialNews.WxMpMaterialNewsArticle.class, new WxMpMaterialNewsArticleGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialNewsBatchGetResult.class, new WxMpMaterialNewsBatchGetGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialNewsBatchGetResult.WxMaterialNewsBatchGetNewsItem.class,
        new WxMpMaterialNewsBatchGetGsonItemAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialFileBatchGetResult.class, new WxMpMaterialFileBatchGetGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMaterialFileBatchGetResult.WxMaterialFileBatchGetNewsItem.class,
        new WxMpMaterialFileBatchGetGsonItemAdapter());
    INSTANCE.registerTypeAdapter(WxMpCardResult.class, new WxMpCardResultGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpCard.class, new WxMpCardGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMassPreviewMessage.class, new WxMpMassPreviewMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMediaImgUploadResult.class, new WxMediaImgUploadResultGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMpTemplateIndustry.class, new WxMpIndustryGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpUserBlacklistGetResult.class, new WxUserBlacklistGetResultGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMemberCardUserInfoResult.class, new WxMpMemberCardUserInfoResultGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMemberCardUpdateResult.class, new WxMpMemberCardUpdateResultGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMpMemberCardActivateTempInfoResult.class,
        new WxMpMemberCardActivateTempInfoResultGsonAdapter());
  }

  public static Gson create() {
    return INSTANCE.create();
  }
}
