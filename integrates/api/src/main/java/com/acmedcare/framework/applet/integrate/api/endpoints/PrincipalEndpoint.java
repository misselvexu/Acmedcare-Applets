package com.acmedcare.framework.applet.integrate.api.endpoints;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.api.bean.Principal;
import com.acmedcare.framework.applet.integrate.api.spi.PrincipalService;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_PRINCIPAL_ENDPOINT;

/**
 * {@link PrincipalEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Path(APPLET_PRINCIPAL_ENDPOINT)
public class PrincipalEndpoint extends AbstractEndpoint {

  /**
   * Get Applet Principal Detail By Custom params
   *
   * @param type applet type flag
   * @param request http servlet request instance of {@link HttpServletRequest}
   * @param <T> Principal result class type
   * @return Principal result
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @POST
  @Path("/{type}")
  @Produces({MediaType.APPLICATION_JSON})
  public <T extends AppletResponse<? extends Principal, String>> T principal(@PathParam("type") String type, @Context HttpServletRequest request) throws AppletException {

    checkAppletType(type);

    PrincipalService principalService = AppletsSPIExtensionFactory.getService(type, PrincipalService.class);

    return principalService.principal(request);
  }
}
