package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialVideoInfoResult;

import java.io.IOException;

public abstract class MaterialVideoInfoRequestExecutor<H, P>
    implements RequestExecutor<WxMpMaterialVideoInfoResult, String> {
  protected RequestHttp<H, P> requestHttp;

  public MaterialVideoInfoRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<WxMpMaterialVideoInfoResult, String> create(
      RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MaterialVideoInfoOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new MaterialVideoInfoApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<WxMpMaterialVideoInfoResult> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
