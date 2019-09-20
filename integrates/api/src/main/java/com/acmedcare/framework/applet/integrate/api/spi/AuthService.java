package com.acmedcare.framework.applet.integrate.api.spi;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.common.spi.Extensible;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link AuthService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Extensible
@SuppressWarnings("unchecked")
public interface AuthService {

  /**
   * Applet Auth Method
   *
   * <p>Current Type Support : Alibaba DingTalk Applet.
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  <T extends AppletResponse> T auth(HttpServletRequest request) throws AppletException;

  /**
   * Bind Applet Account With Biz Account
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  default <T extends AppletResponse> T bind(HttpServletRequest request) throws AppletException {
    // empty implement
    return (T) AppletResponse.appletResponseBuilder().appletResponseBuild();
  }
}
