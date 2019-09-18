package com.acmedcare.framework.applet.integrate.aorp.endpoints;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.aorp.response.DefaultAppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.endpoints.AuthEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link DefaultAuthEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/18.
 */
@Component
public class DefaultAuthEndpoint implements AuthEndpoint {

  private static final Logger log = LoggerFactory.getLogger(DefaultAuthEndpoint.class);

  /**
   * Applet Auth Method
   *
   * @param type applet type
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  @SuppressWarnings("unchecked")
  public DefaultAppletResponse auth(String type, HttpServletRequest request) throws AppletException {

    log.info("[==Applet Auth==] Client-{} request to auth .", type);

    return DefaultAppletResponse.builder().build();
  }
}
