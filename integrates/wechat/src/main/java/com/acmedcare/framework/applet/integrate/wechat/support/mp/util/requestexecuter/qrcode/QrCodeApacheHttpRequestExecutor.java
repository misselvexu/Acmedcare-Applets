package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.qrcode;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.fs.FileUtils;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.InputStreamResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.Utf8ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpQrCodeTicket;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.UUID;

/** Created by ecoolper on 2017/5/5. */
public class QrCodeApacheHttpRequestExecutor
    extends QrCodeRequestExecutor<CloseableHttpClient, HttpHost> {
  public QrCodeApacheHttpRequestExecutor(RequestHttp requestHttp) {
    super(requestHttp);
  }

  @Override
  public File execute(String uri, WxMpQrCodeTicket ticket) throws WxErrorException, IOException {
    if (ticket != null) {
      if (uri.indexOf('?') == -1) {
        uri += '?';
      }
      uri +=
          uri.endsWith("?")
              ? "ticket=" + URLEncoder.encode(ticket.getTicket(), "UTF-8")
              : "&ticket=" + URLEncoder.encode(ticket.getTicket(), "UTF-8");
    }

    HttpGet httpGet = new HttpGet(uri);
    if (requestHttp.getRequestHttpProxy() != null) {
      RequestConfig config =
          RequestConfig.custom().setProxy(requestHttp.getRequestHttpProxy()).build();
      httpGet.setConfig(config);
    }

    try (CloseableHttpResponse response = requestHttp.getRequestHttpClient().execute(httpGet);
        InputStream inputStream = InputStreamResponseHandler.INSTANCE.handleResponse(response); ) {
      Header[] contentTypeHeader = response.getHeaders("Content-Type");
      if (contentTypeHeader != null && contentTypeHeader.length > 0) {
        // 出错
        if (ContentType.TEXT_PLAIN
            .getMimeType()
            .equals(ContentType.parse(contentTypeHeader[0].getValue()).getMimeType())) {
          String responseContent = Utf8ResponseHandler.INSTANCE.handleResponse(response);
          throw new WxErrorException(WxError.fromJson(responseContent, WxType.MP));
        }
      }
      return FileUtils.createTmpFile(inputStream, UUID.randomUUID().toString(), "jpg");
    } finally {
      httpGet.releaseConnection();
    }
  }
}
