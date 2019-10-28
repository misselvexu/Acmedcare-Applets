package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.material;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpProxyInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material.WxMpMaterialNews;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.common.collect.ImmutableMap;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/** Created by ecoolper on 2017/5/5. */
public class MaterialNewsInfoOkhttpRequestExecutor
    extends MaterialNewsInfoRequestExecutor<OkHttpClient, OkHttpProxyInfo> {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public MaterialNewsInfoOkhttpRequestExecutor(RequestHttp requestHttp) {
    super(requestHttp);
  }

  @Override
  public WxMpMaterialNews execute(String uri, String materialId)
      throws WxErrorException, IOException {

    // 得到httpClient
    OkHttpClient client = requestHttp.getRequestHttpClient();

    RequestBody requestBody =
        RequestBody.create(
            MediaType.parse("application/json"),
            WxGsonBuilder.create().toJson(ImmutableMap.of("media_id", materialId)));
    Request request = new Request.Builder().url(uri).post(requestBody).build();

    Response response = client.newCall(request).execute();
    String responseContent = response.body().string();
    this.logger.debug("响应原始数据：{}", responseContent);

    WxError error = WxError.fromJson(responseContent, WxType.MP);
    if (error.getErrorCode() != 0) {
      throw new WxErrorException(error);
    } else {
      return WxMpGsonBuilder.create().fromJson(responseContent, WxMpMaterialNews.class);
    }
  }
}
