package com.acmedcare.framework.applet.integrate.aorp.endpoints;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.aorp.response.DefaultPrincipalResponse;
import com.acmedcare.framework.applet.integrate.api.spi.PrincipalService;
import com.acmedcare.framework.applet.integrate.spi.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link DefaultPrincipalEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Extension("aorp")
public class DefaultPrincipalEndpoint implements PrincipalService {

  private static final Logger log = LoggerFactory.getLogger(DefaultPrincipalEndpoint.class);

  /**
   * Get Applet Principal Detail By Custom params
   *
   * @param request http servlet request instance of {@link HttpServletRequest}
   * @return Principal result
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  @SuppressWarnings("unchecked")
  public DefaultPrincipalResponse principal(HttpServletRequest request)
      throws AppletException {

    String type = request.getHeader("");

    log.info("[==Applet Principal==] Client-{} request to get principal .", type);

    return DefaultPrincipalResponse.builder().build();
  }
}
