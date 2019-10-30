package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.result.WxMediaUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.MediaUploadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaSecCheckService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.google.gson.JsonObject;

import java.io.File;

/**
 *
 *
 * <pre>
 *
 * Created by Acmedcare+ Developer on 2018/11/24.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaSecCheckServiceImpl implements WxMaSecCheckService {
  private WxMaService service;

  public WxMaSecCheckServiceImpl(WxMaService service) {
    this.service = service;
  }

  @Override
  public boolean checkImage(File file) throws WxErrorException {
    // 这里只是借用MediaUploadRequestExecutor，并不使用其返回值WxMediaUploadResult
    WxMediaUploadResult result =
        this.service.execute(
            MediaUploadRequestExecutor.create(this.service.getRequestHttp()),
            IMG_SEC_CHECK_URL,
            file);
    return result != null;
  }

  @Override
  public boolean checkMessage(String msgString) {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("content", msgString);
    try {
      this.service.post(MSG_SEC_CHECK_URL, jsonObject.toString());
    } catch (WxErrorException e) {
      return false;
    }

    return true;
  }
}
