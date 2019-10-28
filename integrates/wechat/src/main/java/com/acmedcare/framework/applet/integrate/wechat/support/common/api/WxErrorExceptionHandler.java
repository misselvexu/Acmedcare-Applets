package com.acmedcare.framework.applet.integrate.wechat.support.common.api;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;

/**
 * WxErrorException处理器.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxErrorExceptionHandler {

  void handle(WxErrorException e);
}
