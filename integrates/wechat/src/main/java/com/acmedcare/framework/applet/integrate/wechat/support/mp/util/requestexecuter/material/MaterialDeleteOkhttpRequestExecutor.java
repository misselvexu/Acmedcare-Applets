package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.ResponseHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpProxyInfo;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/** Created by ecoolper on 2017/5/5. */
public class MaterialDeleteOkhttpRequestExecutor
    extends MaterialDeleteRequestExecutor<OkHttpClient, OkHttpProxyInfo> {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public MaterialDeleteOkhttpRequestExecutor(RequestHttp requestHttp) {
    super(requestHttp);
  }

  @Override
  public void execute(String uri, String data, ResponseHandler<Boolean> handler)
      throws WxErrorException, IOException {
    handler.handle(this.execute(uri, data));
  }

  @Override
  public Boolean execute(String uri, String materialId) throws WxErrorException, IOException {
    logger.debug("MaterialDeleteOkhttpRequestExecutor is running");
    // 得到httpClient
    OkHttpClient client = requestHttp.getRequestHttpClient();

    RequestBody requestBody = new FormBody.Builder().add("media_id", materialId).build();
    Request request = new Request.Builder().url(uri).post(requestBody).build();
    Response response = client.newCall(request).execute();
    String responseContent = response.body().string();
    WxError error = WxError.fromJson(responseContent, WxType.MP);
    if (error.getErrorCode() != 0) {
      throw new WxErrorException(error);
    } else {
      return true;
    }
  }
}
