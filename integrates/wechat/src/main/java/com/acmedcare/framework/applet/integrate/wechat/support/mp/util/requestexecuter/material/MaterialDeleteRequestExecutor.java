package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;

import java.io.IOException;

public abstract class MaterialDeleteRequestExecutor<H, P>
    implements RequestExecutor<Boolean, String> {
  protected RequestHttp<H, P> requestHttp;

  public MaterialDeleteRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<Boolean, String> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MaterialDeleteOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new MaterialDeleteApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<Boolean> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
