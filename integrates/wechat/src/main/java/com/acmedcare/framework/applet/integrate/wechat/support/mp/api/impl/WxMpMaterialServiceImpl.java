package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.api.WxConsts;
import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.result.WxMediaUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.fs.FileUtils;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.BaseMediaDownloadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.MediaUploadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpMaterialService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material.*;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.media.MediaImgUploadRequestExecutor;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Binary Wang on 2016/7/21.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@RequiredArgsConstructor
public class WxMpMaterialServiceImpl implements WxMpMaterialService {
  private final WxMpService wxMpService;

  @Override
  public WxMediaUploadResult mediaUpload(String mediaType, String fileType, InputStream inputStream)
      throws WxErrorException {
    File tmpFile = null;
    try {
      tmpFile = FileUtils.createTmpFile(inputStream, UUID.randomUUID().toString(), fileType);
      return this.mediaUpload(mediaType, tmpFile);
    } catch (IOException e) {
      throw new WxErrorException(
          WxError.builder().errorCode(-1).errorMsg(e.getMessage()).build(), e);
    } finally {
      if (tmpFile != null) {
        tmpFile.delete();
      }
    }
  }

  @Override
  public WxMediaUploadResult mediaUpload(String mediaType, File file) throws WxErrorException {
    String url =
        String.format(
            WxMpApiUrl.Material.MEDIA_UPLOAD_URL.getUrl(this.wxMpService.getWxMpConfigStorage()),
            mediaType);
    return this.wxMpService.execute(
        MediaUploadRequestExecutor.create(this.wxMpService.getRequestHttp()), url, file);
  }

  @Override
  public File mediaDownload(String mediaId) throws WxErrorException {
    return this.wxMpService.execute(
        BaseMediaDownloadRequestExecutor.create(
            this.wxMpService.getRequestHttp(),
            this.wxMpService.getWxMpConfigStorage().getTmpDirFile()),
        WxMpApiUrl.Material.MEDIA_GET_URL,
        "media_id=" + mediaId);
  }

  @Override
  public WxMediaImgUploadResult mediaImgUpload(File file) throws WxErrorException {
    return this.wxMpService.execute(
        MediaImgUploadRequestExecutor.create(this.wxMpService.getRequestHttp()),
        WxMpApiUrl.Material.IMG_UPLOAD_URL,
        file);
  }

  @Override
  public WxMpMaterialUploadResult materialFileUpload(String mediaType, WxMpMaterial material)
      throws WxErrorException {
    String url =
        String.format(
            WxMpApiUrl.Material.MATERIAL_ADD_URL.getUrl(this.wxMpService.getWxMpConfigStorage()),
            mediaType);
    return this.wxMpService.execute(
        MaterialUploadRequestExecutor.create(this.wxMpService.getRequestHttp()), url, material);
  }

  @Override
  public WxMpMaterialUploadResult materialNewsUpload(WxMpMaterialNews news)
      throws WxErrorException {
    if (news == null || news.isEmpty()) {
      throw new IllegalArgumentException("news is empty!");
    }
    String responseContent = this.wxMpService.post(WxMpApiUrl.Material.NEWS_ADD_URL, news.toJson());
    return WxMpMaterialUploadResult.fromJson(responseContent);
  }

  @Override
  public InputStream materialImageOrVoiceDownload(String mediaId) throws WxErrorException {
    return this.wxMpService.execute(
        MaterialVoiceAndImageDownloadRequestExecutor.create(
            this.wxMpService.getRequestHttp(),
            this.wxMpService.getWxMpConfigStorage().getTmpDirFile()),
        WxMpApiUrl.Material.MATERIAL_GET_URL,
        mediaId);
  }

  @Override
  public WxMpMaterialVideoInfoResult materialVideoInfo(String mediaId) throws WxErrorException {
    return this.wxMpService.execute(
        MaterialVideoInfoRequestExecutor.create(this.wxMpService.getRequestHttp()),
        WxMpApiUrl.Material.MATERIAL_GET_URL,
        mediaId);
  }

  @Override
  public WxMpMaterialNews materialNewsInfo(String mediaId) throws WxErrorException {
    return this.wxMpService.execute(
        MaterialNewsInfoRequestExecutor.create(this.wxMpService.getRequestHttp()),
        WxMpApiUrl.Material.MATERIAL_GET_URL,
        mediaId);
  }

  @Override
  public boolean materialNewsUpdate(WxMpMaterialArticleUpdate wxMpMaterialArticleUpdate)
      throws WxErrorException {
    String responseText =
        this.wxMpService.post(
            WxMpApiUrl.Material.NEWS_UPDATE_URL, wxMpMaterialArticleUpdate.toJson());
    WxError wxError = WxError.fromJson(responseText, WxType.MP);
    if (wxError.getErrorCode() == 0) {
      return true;
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public boolean materialDelete(String mediaId) throws WxErrorException {
    return this.wxMpService.execute(
        MaterialDeleteRequestExecutor.create(this.wxMpService.getRequestHttp()),
        WxMpApiUrl.Material.MATERIAL_DEL_URL,
        mediaId);
  }

  @Override
  public WxMpMaterialCountResult materialCount() throws WxErrorException {
    String responseText = this.wxMpService.get(WxMpApiUrl.Material.MATERIAL_GET_COUNT_URL, null);
    WxError wxError = WxError.fromJson(responseText, WxType.MP);
    if (wxError.getErrorCode() == 0) {
      return WxMpGsonBuilder.create().fromJson(responseText, WxMpMaterialCountResult.class);
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public WxMpMaterialNewsBatchGetResult materialNewsBatchGet(int offset, int count)
      throws WxErrorException {
    Map<String, Object> params = new HashMap<>(4);
    params.put("type", WxConsts.MaterialType.NEWS);
    params.put("offset", offset);
    params.put("count", count);
    String responseText =
        this.wxMpService.post(
            WxMpApiUrl.Material.MATERIAL_BATCHGET_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText, WxType.MP);
    if (wxError.getErrorCode() == 0) {
      return WxMpGsonBuilder.create().fromJson(responseText, WxMpMaterialNewsBatchGetResult.class);
    } else {
      throw new WxErrorException(wxError);
    }
  }

  @Override
  public WxMpMaterialFileBatchGetResult materialFileBatchGet(String type, int offset, int count)
      throws WxErrorException {
    Map<String, Object> params = new HashMap<>(4);
    params.put("type", type);
    params.put("offset", offset);
    params.put("count", count);
    String responseText =
        this.wxMpService.post(
            WxMpApiUrl.Material.MATERIAL_BATCHGET_URL, WxGsonBuilder.create().toJson(params));
    WxError wxError = WxError.fromJson(responseText, WxType.MP);
    if (wxError.getErrorCode() == 0) {
      return WxMpGsonBuilder.create().fromJson(responseText, WxMpMaterialFileBatchGetResult.class);
    } else {
      throw new WxErrorException(wxError);
    }
  }
}
