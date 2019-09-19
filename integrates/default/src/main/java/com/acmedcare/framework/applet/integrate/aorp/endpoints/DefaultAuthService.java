package com.acmedcare.framework.applet.integrate.aorp.endpoints;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.aorp.response.DefaultAppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;
import com.acmedcare.framework.applet.integrate.spi.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link DefaultAuthService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/18.
 */
@Extension("aorp")
public class DefaultAuthService implements AuthService {

  private static final Logger log = LoggerFactory.getLogger(DefaultAuthService.class);

  /**
   * Applet Auth Method
   *
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  @SuppressWarnings("unchecked")
  public DefaultAppletResponse auth(HttpServletRequest request) throws AppletException {

    String type = request.getHeader("");

    log.info("[==Applet Auth==] Client-{} request to auth .", type);

    return DefaultAppletResponse.builder().build();
  }
}
