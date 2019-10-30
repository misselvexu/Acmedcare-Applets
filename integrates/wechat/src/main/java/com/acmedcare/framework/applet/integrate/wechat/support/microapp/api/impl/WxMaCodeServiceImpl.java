package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.BaseMediaDownloadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.GsonHelper;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaCodeService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.code.*;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @since 2018-04-26 20:00
 */
public class WxMaCodeServiceImpl implements WxMaCodeService {
  private static final JsonParser JSON_PARSER = new JsonParser();
  private WxMaService wxMaService;

  public WxMaCodeServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }

  @Override
  public void commit(WxMaCodeCommitRequest commitRequest) throws WxErrorException {
    this.wxMaService.post(COMMIT_URL, commitRequest.toJson());
  }

  @Override
  public byte[] getQrCode(String path) throws WxErrorException {
    String appId = this.wxMaService.getWxMaConfig().getAppid();
    Path qrCodeFilePath = null;
    try {
      RequestExecutor<File, String> executor =
          BaseMediaDownloadRequestExecutor.create(
              this.wxMaService.getRequestHttp(),
              Files.createTempDirectory("weixin-java-tools-ma-" + appId).toFile());

      final StringBuilder url = new StringBuilder(GET_QRCODE_URL);
      if (StringUtils.isNotBlank(path)) {
        url.append("?path=").append(URLEncoder.encode(path, StandardCharsets.UTF_8.name()));
      }

      qrCodeFilePath = this.wxMaService.execute(executor, url.toString(), null).toPath();
      return Files.readAllBytes(qrCodeFilePath);
    } catch (IOException e) {
      throw new WxErrorException(WxError.builder().errorMsg(e.getMessage()).build(), e);
    } finally {
      if (qrCodeFilePath != null) {
        try {
          // 及时删除二维码文件，避免积压过多缓存文件
          Files.delete(qrCodeFilePath);
        } catch (Exception ignored) {
        }
      }
    }
  }

  @Override
  public List<WxMaCategory> getCategory() throws WxErrorException {
    String responseContent = this.wxMaService.get(GET_CATEGORY_URL, null);
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    boolean hasCategoryList = jsonObject.has("category_list");
    if (hasCategoryList) {
      return WxMaGsonBuilder.create()
          .fromJson(
              jsonObject.getAsJsonArray("category_list"),
              new TypeToken<List<WxMaCategory>>() {}.getType());
    } else {
      return null;
    }
  }

  @Override
  public List<String> getPage() throws WxErrorException {
    String responseContent = this.wxMaService.get(GET_PAGE_URL, null);
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    boolean hasPageList = jsonObject.has("page_list");
    if (hasPageList) {
      return WxMaGsonBuilder.create()
          .fromJson(
              jsonObject.getAsJsonArray("page_list"), new TypeToken<List<String>>() {}.getType());
    } else {
      return null;
    }
  }

  @Override
  public long submitAudit(WxMaCodeSubmitAuditRequest auditRequest) throws WxErrorException {
    String responseContent = this.wxMaService.post(SUBMIT_AUDIT_URL, auditRequest.toJson());
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    return GsonHelper.getLong(jsonObject, "auditid");
  }

  @Override
  public WxMaCodeAuditStatus getAuditStatus(long auditId) throws WxErrorException {
    JsonObject param = new JsonObject();
    param.addProperty("auditid", auditId);
    String responseContent = this.wxMaService.post(GET_AUDIT_STATUS_URL, param.toString());
    return WxMaCodeAuditStatus.fromJson(responseContent);
  }

  @Override
  public WxMaCodeAuditStatus getLatestAuditStatus() throws WxErrorException {
    String responseContent = this.wxMaService.get(GET_LATEST_AUDIT_STATUS_URL, null);
    return WxMaCodeAuditStatus.fromJson(responseContent);
  }

  @Override
  public void release() throws WxErrorException {
    this.wxMaService.post(RELEASE_URL, "{}");
  }

  @Override
  public void changeVisitStatus(String action) throws WxErrorException {
    JsonObject param = new JsonObject();
    param.addProperty("action", action);
    this.wxMaService.post(CHANGE_VISIT_STATUS_URL, param.toString());
  }

  @Override
  public void revertCodeRelease() throws WxErrorException {
    this.wxMaService.get(REVERT_CODE_RELEASE_URL, null);
  }

  @Override
  public WxMaCodeVersionDistribution getSupportVersion() throws WxErrorException {
    String responseContent = this.wxMaService.post(GET_SUPPORT_VERSION_URL, "{}");
    return WxMaCodeVersionDistribution.fromJson(responseContent);
  }

  @Override
  public void setSupportVersion(String version) throws WxErrorException {
    JsonObject param = new JsonObject();
    param.addProperty("version", version);
    this.wxMaService.post(SET_SUPPORT_VERSION_URL, param.toString());
  }

  @Override
  public void undoCodeAudit() throws WxErrorException {
    this.wxMaService.get(UNDO_CODE_AUDIT_URL, null);
  }
}
