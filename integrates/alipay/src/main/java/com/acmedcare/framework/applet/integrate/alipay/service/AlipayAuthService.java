package com.acmedcare.framework.applet.integrate.alipay.service;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;

import javax.servlet.http.HttpServletRequest;

import static com.acmedcare.framework.applet.integrate.alipay.AlipayExtensionDefined.ALIPAY;

/**
 * {@link AlipayAuthService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/10/31.
 */
@Extension(ALIPAY)
public class AlipayAuthService implements AuthService {

  /**
   * Applet Auth Method
   *
   * <p>Current Type Support : Alibaba DingTalk Applet.
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public <T extends AppletResponse> T auth(HttpServletRequest request) throws AppletException {
    return null;
  }

  /**
   * Bind Applet Account With Biz Account
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public <T extends AppletResponse> T bind(HttpServletRequest request) throws AppletException {
    return null;
  }

  /**
   * Un-Bind Applet Account With Biz Account
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public <T extends AppletResponse> T unbind(HttpServletRequest request) throws AppletException {
    return null;
  }
}
