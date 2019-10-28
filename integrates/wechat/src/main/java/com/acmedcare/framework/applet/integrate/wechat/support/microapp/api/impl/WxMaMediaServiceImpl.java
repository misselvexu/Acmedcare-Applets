package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.result.WxMediaUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.fs.FileUtils;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.BaseMediaDownloadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.MediaUploadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaMediaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.UUID;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaMediaServiceImpl implements WxMaMediaService {
  private WxMaService wxMaService;

  public WxMaMediaServiceImpl(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
  }

  @Override
  public WxMediaUploadResult uploadMedia(String mediaType, String fileType, InputStream inputStream)
      throws WxErrorException {
    try {
      return this.uploadMedia(
          mediaType, FileUtils.createTmpFile(inputStream, UUID.randomUUID().toString(), fileType));
    } catch (IOException e) {
      throw new WxErrorException(WxError.builder().errorMsg(e.getMessage()).build(), e);
    }
  }

  @Override
  public WxMediaUploadResult uploadMedia(String mediaType, File file) throws WxErrorException {
    String url = String.format(MEDIA_UPLOAD_URL, mediaType);
    return this.wxMaService.execute(
        MediaUploadRequestExecutor.create(this.wxMaService.getRequestHttp()), url, file);
  }

  @Override
  public File getMedia(String mediaId) throws WxErrorException {
    try {
      RequestExecutor<File, String> executor =
          BaseMediaDownloadRequestExecutor.create(
              this.wxMaService.getRequestHttp(), Files.createTempDirectory("wxma").toFile());
      return this.wxMaService.execute(executor, MEDIA_GET_URL, "media_id=" + mediaId);
    } catch (IOException e) {
      throw new WxErrorException(WxError.builder().errorMsg(e.getMessage()).build(), e);
    }
  }
}
