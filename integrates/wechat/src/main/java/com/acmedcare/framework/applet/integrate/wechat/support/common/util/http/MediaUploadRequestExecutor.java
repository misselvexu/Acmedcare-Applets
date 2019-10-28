package com.acmedcare.framework.applet.integrate.wechat.support.common.util.http;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.result.WxMediaUploadResult;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.ApacheMediaUploadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpMediaUploadRequestExecutor;

import java.io.File;
import java.io.IOException;

/**
 * 上传媒体文件请求执行器. 请求的参数是File, 返回的结果是String
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class MediaUploadRequestExecutor<H, P>
    implements RequestExecutor<WxMediaUploadResult, File> {
  protected RequestHttp<H, P> requestHttp;

  public MediaUploadRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  public static RequestExecutor<WxMediaUploadResult, File> create(RequestHttp requestHttp) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new OkHttpMediaUploadRequestExecutor(requestHttp);
      case APACHE_HTTP:
      default:
        return new ApacheMediaUploadRequestExecutor(requestHttp);
    }
  }

  @Override
  public void execute(String uri, File data, ResponseHandler<WxMediaUploadResult> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
