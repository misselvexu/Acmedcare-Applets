package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.qrcode;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpQrCodeTicket;

import java.io.File;
import java.io.IOException;

/**
 * 获得QrCode图片 请求执行器.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class QrCodeRequestExecutor<H, P>
    implements RequestExecutor<File, WxMpQrCodeTicket> {
  protected RequestHttp<H, P> requestHttp;

  public QrCodeRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<File, WxMpQrCodeTicket> create(RequestHttp requestHttp)
      throws WxErrorException {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new QrCodeOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new QrCodeApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, WxMpQrCodeTicket data, ResponseHandler<File> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
