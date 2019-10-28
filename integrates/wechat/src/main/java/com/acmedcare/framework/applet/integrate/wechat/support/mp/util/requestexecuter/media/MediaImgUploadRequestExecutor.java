package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.media;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMediaImgUploadResult;

import java.io.File;
import java.io.IOException;

/** @author miller */
public abstract class MediaImgUploadRequestExecutor<H, P>
    implements RequestExecutor<WxMediaImgUploadResult, File> {
  protected RequestHttp<H, P> requestHttp;

  public MediaImgUploadRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<WxMediaImgUploadResult, File> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MediaImgUploadOkhttpRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new MediaImgUploadApacheHttpRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, File data, ResponseHandler<WxMediaImgUploadResult> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
