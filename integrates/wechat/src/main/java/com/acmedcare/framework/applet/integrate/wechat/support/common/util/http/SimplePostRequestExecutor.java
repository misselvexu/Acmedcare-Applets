package com.acmedcare.framework.applet.integrate.wechat.support.common.util.http;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.ApacheSimplePostRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpSimplePostRequestExecutor;

import java.io.IOException;

/**
 * 用装饰模式实现 简单的POST请求执行器，请求的参数是String, 返回的结果也是String
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class SimplePostRequestExecutor<H, P> implements RequestExecutor<String, String> {
  protected RequestHttp<H, P> requestHttp;

  public SimplePostRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<String, String> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new OkHttpSimplePostRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new ApacheSimplePostRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<String> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
