package com.acmedcare.framework.applet.integrate.dingtalk.service;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.bean.Principal;
import com.acmedcare.framework.applet.integrate.api.spi.PrincipalService;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;

import javax.servlet.http.HttpServletRequest;

/**
 * {@link DingTalkPrincipalService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Extension("dingtalk")
public class DingTalkPrincipalService implements PrincipalService {

  /**
   * Get Applet Principal Detail By Custom params
   *
   * @param request http servlet request instance of {@link HttpServletRequest}
   * @return Principal result
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @Override
  public <T extends AppletResponse<? extends Principal, String>> T principal(HttpServletRequest request) throws AppletException {



    return null;
  }
}
