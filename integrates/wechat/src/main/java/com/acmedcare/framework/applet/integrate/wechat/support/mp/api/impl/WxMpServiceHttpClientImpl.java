package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.WxAccessToken;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.HttpType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.ApacheHttpClientBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.DefaultApacheHttpClientBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.config.WxMpConfigStorage;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;
import java.util.concurrent.locks.Lock;

/**
 * apache http client方式实现.
 *
 * @author someone
 */
public class WxMpServiceHttpClientImpl extends BaseWxMpServiceImpl<CloseableHttpClient, HttpHost> {
  private CloseableHttpClient httpClient;
  private HttpHost httpProxy;

  @Override
  public CloseableHttpClient getRequestHttpClient() {
    return httpClient;
  }

  @Override
  public HttpHost getRequestHttpProxy() {
    return httpProxy;
  }

  @Override
  public HttpType getRequestType() {
    return HttpType.APACHE_HTTP;
  }

  @Override
  public void initHttp() {
    WxMpConfigStorage configStorage = this.getWxMpConfigStorage();
    ApacheHttpClientBuilder apacheHttpClientBuilder = configStorage.getApacheHttpClientBuilder();
    if (null == apacheHttpClientBuilder) {
      apacheHttpClientBuilder = DefaultApacheHttpClientBuilder.get();
    }

    apacheHttpClientBuilder
        .httpProxyHost(configStorage.getHttpProxyHost())
        .httpProxyPort(configStorage.getHttpProxyPort())
        .httpProxyUsername(configStorage.getHttpProxyUsername())
        .httpProxyPassword(configStorage.getHttpProxyPassword());

    if (configStorage.getHttpProxyHost() != null && configStorage.getHttpProxyPort() > 0) {
      this.httpProxy =
          new HttpHost(configStorage.getHttpProxyHost(), configStorage.getHttpProxyPort());
    }

    this.httpClient = apacheHttpClientBuilder.build();
  }

  @Override
  public String getAccessToken(boolean forceRefresh) throws WxErrorException {
    final WxMpConfigStorage config = this.getWxMpConfigStorage();
    if (!config.isAccessTokenExpired() && !forceRefresh) {
      return config.getAccessToken();
    }

    Lock lock = config.getAccessTokenLock();
    lock.lock();
    try {
      String url =
          String.format(
              WxMpApiUrl.Other.GET_ACCESS_TOKEN_URL.getUrl(config),
              config.getAppId(),
              config.getSecret());
      try {
        HttpGet httpGet = new HttpGet(url);
        if (this.getRequestHttpProxy() != null) {
          RequestConfig requestConfig =
              RequestConfig.custom().setProxy(this.getRequestHttpProxy()).build();
          httpGet.setConfig(requestConfig);
        }
        try (CloseableHttpResponse response = getRequestHttpClient().execute(httpGet)) {
          String resultContent = new BasicResponseHandler().handleResponse(response);
          WxError error = WxError.fromJson(resultContent, WxType.MP);
          if (error.getErrorCode() != 0) {
            throw new WxErrorException(error);
          }
          WxAccessToken accessToken = WxAccessToken.fromJson(resultContent);
          config.updateAccessToken(accessToken.getAccessToken(), accessToken.getExpiresIn());
          return config.getAccessToken();
        } finally {
          httpGet.releaseConnection();
        }
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    } finally {
      lock.unlock();
    }
  }
}
