package com.acmedcare.framework.applet.integrate.api.endpoints;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_AUTH_ENDPOINT;

/**
 * {@link AuthEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/18.
 */
@Path(APPLET_AUTH_ENDPOINT)
public class AuthEndpoint extends AbstractEndpoint {

  /**
   * Applet Auth Method
   *
   * <p>Current Type Support : Alibaba DingTalk Applet.
   *
   * @param type applet type
   * @param request http request instance of {@link HttpServletRequest}
   * @return instance of {@link AppletResponse}
   * @throws AppletException maybe thrown {@link AppletException}
   */
  @POST
  @Path("/{type}")
  @Produces({MediaType.APPLICATION_JSON})
  public <T extends AppletResponse> T auth(@PathParam("type") String type, @Context HttpServletRequest request) throws AppletException {

    checkAppletType(type);

    AuthService authService = AppletsSPIExtensionFactory.getService(type, AuthService.class);

    return authService.auth(request);
  }

}
