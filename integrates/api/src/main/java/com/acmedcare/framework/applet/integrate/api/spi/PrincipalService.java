package com.acmedcare.framework.applet.integrate.api.spi;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.bean.Principal;
import com.acmedcare.framework.applet.integrate.common.spi.Extensible;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link PrincipalService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Extensible
public interface PrincipalService {

  /**
   * Get Applet Principal Detail By Custom params
   *
   * @param request http servlet request instance of {@link HttpServletRequest}
   * @param <T> Principal result class type
   * @return Principal result
   * @throws AppletException maybe thrown {@link AppletException}
   */
  <T extends AppletResponse<? extends Principal, String>> T principal(HttpServletRequest request) throws AppletException;

}
