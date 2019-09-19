package com.acmedcare.framework.applet.integrate.aorp.endpoints;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.aorp.response.DefaultPrincipalResponse;
import com.acmedcare.framework.applet.integrate.api.endpoints.PrincipalEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link DefaultPrincipalEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Component
public class DefaultPrincipalEndpoint implements PrincipalEndpoint {

  private static final Logger log = LoggerFactory.getLogger(DefaultPrincipalEndpoint.class);

  /**
   * Get Applet Principal Detail By Custom params
   *
   * @param type applet type flag
   * @param request http servlet request instance of {@link HttpServletRequest}
   * @return Principal result
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  @SuppressWarnings("unchecked")
  public DefaultPrincipalResponse principal(String type, HttpServletRequest request)
      throws AppletException {

    log.info("[==Applet Principal==] Client-{} request to get principal .", type);

    return DefaultPrincipalResponse.builder().build();
  }
}
