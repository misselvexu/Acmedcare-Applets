package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public abstract class MaterialVoiceAndImageDownloadRequestExecutor<H, P>
    implements RequestExecutor<InputStream, String> {
  protected RequestHttp<H, P> requestHttp;
  protected File tmpDirFile;

  public MaterialVoiceAndImageDownloadRequestExecutor(RequestHttp requestHttp, File tmpDirFile) {
    this.requestHttp = requestHttp;
    this.tmpDirFile = tmpDirFile;
  }

  public static RequestExecutor<InputStream, String> create(
      RequestHttp requestHttp, File tmpDirFile) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new MaterialVoiceAndImageDownloadOkhttpRequestExecutor(requestHttp, tmpDirFile);
      case APACHE_HTTP:
      default:
        return new MaterialVoiceAndImageDownloadApacheHttpRequestExecutor(requestHttp, tmpDirFile);
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<InputStream> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
