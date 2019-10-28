package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.media;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.Utf8ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMediaImgUploadResult;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.File;
import java.io.IOException;

/**
 * Created by ecoolper on 2017/5/5.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class MediaImgUploadApacheHttpRequestExecutor
    extends MediaImgUploadRequestExecutor<CloseableHttpClient, HttpHost> {
  public MediaImgUploadApacheHttpRequestExecutor(RequestHttp requestHttp) {
    super(requestHttp);
  }

  @Override
  public WxMediaImgUploadResult execute(String uri, File data)
      throws WxErrorException, IOException {
    if (data == null) {
      throw new WxErrorException(WxError.builder().errorCode(-1).errorMsg("文件对象为空").build());
    }

    HttpPost httpPost = new HttpPost(uri);
    if (requestHttp.getRequestHttpProxy() != null) {
      RequestConfig config =
          RequestConfig.custom().setProxy(requestHttp.getRequestHttpProxy()).build();
      httpPost.setConfig(config);
    }

    HttpEntity entity =
        MultipartEntityBuilder.create()
            .addBinaryBody("media", data)
            .setMode(HttpMultipartMode.RFC6532)
            .build();
    httpPost.setEntity(entity);
    httpPost.setHeader("Content-Type", ContentType.MULTIPART_FORM_DATA.toString());

    try (CloseableHttpResponse response = requestHttp.getRequestHttpClient().execute(httpPost)) {
      String responseContent = Utf8ResponseHandler.INSTANCE.handleResponse(response);
      WxError error = WxError.fromJson(responseContent, WxType.MP);
      if (error.getErrorCode() != 0) {
        throw new WxErrorException(error);
      }

      return WxMediaImgUploadResult.fromJson(responseContent);
    } finally {
      httpPost.releaseConnection();
    }
  }
}
