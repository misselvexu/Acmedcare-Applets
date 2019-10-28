package com.acmedcare.framework.applet.integrate.wechat.support.open.util.requestexecuter.ma;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.ma.WxMaQrcodeParam;

import java.io.File;
import java.io.IOException;

/**
 * 获得小程序体验QrCode图片 请求执行器.
 *
 * @author yqx
 * @date 2018-09-13
 */
public abstract class MaQrCodeRequestExecutor<H, P>
    implements RequestExecutor<File, WxMaQrcodeParam> {
  protected RequestHttp<H, P> requestHttp;

  public MaQrCodeRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<File, WxMaQrcodeParam> create(RequestHttp requestHttp)
      throws WxErrorException {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MaQrCodeOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new MaQrCodeApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, WxMaQrcodeParam data, ResponseHandler<File> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
