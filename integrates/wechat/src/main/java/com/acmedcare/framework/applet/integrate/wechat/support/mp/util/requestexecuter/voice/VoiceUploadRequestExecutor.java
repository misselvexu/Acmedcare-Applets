package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.voice;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;

import java.io.File;
import java.io.IOException;

/**
 *
 *
 * <pre>
 *  Created by BinaryWang on 2018/6/9.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class VoiceUploadRequestExecutor<H, P> implements RequestExecutor<Boolean, File> {
  protected RequestHttp<H, P> requestHttp;

  public VoiceUploadRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<Boolean, File> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case APACHE_HTTP:
        return new VoiceUploadApacheHttpRequestExecutor(requestHttp);
      case OK_HTTP:
      default:
        return null;
    }
  }

  @Override
  public void execute(String uri, File data, ResponseHandler<Boolean> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
