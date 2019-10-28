package com.acmedcare.framework.applet.integrate.wechat.support.common.util.http;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.ApacheHttpClientSimpleGetRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpSimpleGetRequestExecutor;

import java.io.IOException;

/**
 * 简单的GET请求执行器. 请求的参数是String, 返回的结果也是String
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class SimpleGetRequestExecutor<H, P> implements RequestExecutor<String, String> {
  protected RequestHttp<H, P> requestHttp;

  public SimpleGetRequestExecutor(RequestHttp<H, P> requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<String, String> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case APACHE_HTTP:
        return new ApacheHttpClientSimpleGetRequestExecutor(requestHttp);
      case OK_HTTP:
        return new OkHttpSimpleGetRequestExecutor(requestHttp);
      default:
        throw new IllegalArgumentException("非法请求参数");
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<String> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
