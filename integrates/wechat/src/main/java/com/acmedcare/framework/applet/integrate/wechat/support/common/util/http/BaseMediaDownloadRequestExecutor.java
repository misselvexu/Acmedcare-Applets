package com.acmedcare.framework.applet.integrate.wechat.support.common.util.http;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.apache.ApacheMediaDownloadRequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpMediaDownloadRequestExecutor;

import java.io.File;
import java.io.IOException;

/**
 * 下载媒体文件请求执行器. 请求的参数是String, 返回的结果是File 视频文件不支持下载
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public abstract class BaseMediaDownloadRequestExecutor<H, P>
    implements RequestExecutor<File, String> {
  protected RequestHttp<H, P> requestHttp;
  protected File tmpDirFile;

  public BaseMediaDownloadRequestExecutor(RequestHttp<H, P> requestHttp, File tmpDirFile) {
    this.requestHttp = requestHttp;
    this.tmpDirFile = tmpDirFile;
  }

  public static RequestExecutor<File, String> create(RequestHttp requestHttp, File tmpDirFile) {
    switch (requestHttp.getRequestType()) {
      case OK_HTTP:
        return new OkHttpMediaDownloadRequestExecutor(requestHttp, tmpDirFile);
      case APACHE_HTTP:
      default:
        return new ApacheMediaDownloadRequestExecutor(requestHttp, tmpDirFile);
    }
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<File> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }
}
