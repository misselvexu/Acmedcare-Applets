package com.acmedcare.framework.applet.integrate.wechat.support.open.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestExecutor;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenComponentService;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenConfigStorage;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public abstract class WxOpenServiceAbstractImpl<H, P> implements WxOpenService, RequestHttp<H, P> {
  private final Logger log = LoggerFactory.getLogger(this.getClass());
  private WxOpenComponentService wxOpenComponentService = new WxOpenComponentServiceImpl(this);
  private WxOpenConfigStorage wxOpenConfigStorage;

  @Override
  public WxOpenComponentService getWxOpenComponentService() {
    return wxOpenComponentService;
  }

  @Override
  public WxOpenConfigStorage getWxOpenConfigStorage() {
    return wxOpenConfigStorage;
  }

  @Override
  public void setWxOpenConfigStorage(WxOpenConfigStorage wxOpenConfigStorage) {
    this.wxOpenConfigStorage = wxOpenConfigStorage;
    this.initHttp();
  }

  /** 初始化 RequestHttp. */
  public abstract void initHttp();

  protected synchronized <T, E> T execute(RequestExecutor<T, E> executor, String uri, E data)
      throws WxErrorException {
    try {
      T result = executor.execute(uri, data);
      this.log.info("\n【请求地址】: {}\n【请求参数】：{}\n【响应数据】：{}", uri, data, result);
      return result;
    } catch (WxErrorException e) {
      WxError error = e.getError();
      if (error.getErrorCode() != 0) {
        this.log.error("\n【请求地址】: {}\n【请求参数】：{}\n【错误信息】：{}", uri, data, error);
        throw new WxErrorException(error, e);
      }
      return null;
    } catch (IOException e) {
      this.log.error("\n【请求地址】: {}\n【请求参数】：{}\n【异常信息】：{}", uri, data, e.getMessage());
      throw new RuntimeException(e);
    }
  }
}
