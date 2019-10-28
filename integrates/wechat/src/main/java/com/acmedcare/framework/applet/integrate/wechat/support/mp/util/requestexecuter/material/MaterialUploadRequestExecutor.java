package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterial;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialUploadResult;

import java.io.IOException;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class MaterialUploadRequestExecutor<H, P>
    implements RequestExecutor<WxMpMaterialUploadResult, WxMpMaterial> {
  protected RequestHttp<H, P> requestHttp;

  public MaterialUploadRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<WxMpMaterialUploadResult, WxMpMaterial> create(
      RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MaterialUploadOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new MaterialUploadApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(
      String uri, WxMpMaterial data, ResponseHandler<WxMpMaterialUploadResult> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
