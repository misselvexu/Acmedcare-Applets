package com.acmedcare.framework.applet.integrate.wechat.support.open.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.HttpType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.SimpleGetRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.SimplePostRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.ApacheHttpClientBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.DefaultApacheHttpClientBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenConfigStorage;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * apache-http方式实现
 *
 * @author <a href="https://github.com/007gzs">007</a>
 */
public class WxOpenServiceApacheHttpClientImpl
    extends WxOpenServiceAbstractImpl<CloseableHttpClient, HttpHost> {
  private CloseableHttpClient httpClient;
  private HttpHost httpProxy;

  @Override
  public void initHttp() {
    WxOpenConfigStorage configStorage = this.getWxOpenConfigStorage();
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
  public String get(String url, String queryParam) throws WxErrorException {
    return execute(SimpleGetRequestExecutor.create(this), url, queryParam);
  }

  @Override
  public String post(String url, String postData) throws WxErrorException {
    return execute(SimplePostRequestExecutor.create(this), url, postData);
  }
}
