package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialNews;

import java.io.IOException;

public abstract class MaterialNewsInfoRequestExecutor<H, P>
    implements RequestExecutor<WxMpMaterialNews, String> {
  protected RequestHttp<H, P> requestHttp;

  public MaterialNewsInfoRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<WxMpMaterialNews, String> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MaterialNewsInfoOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new MaterialNewsInfoApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<WxMpMaterialNews> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
