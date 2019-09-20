package com.acmedcare.framework.applet.integrate.aorp.service;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.aorp.response.DefaultPrincipalResponse;
import com.acmedcare.framework.applet.integrate.api.spi.PrincipalService;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link DefaultPrincipalService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Extension("aorp")
public class DefaultPrincipalService implements PrincipalService {

  private static final Logger log = LoggerFactory.getLogger(DefaultPrincipalService.class);

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

    log.info("[==Applet Principal==] Client-Aorp request to get principal .");

    return DefaultPrincipalResponse.builder().build();
  }
}
