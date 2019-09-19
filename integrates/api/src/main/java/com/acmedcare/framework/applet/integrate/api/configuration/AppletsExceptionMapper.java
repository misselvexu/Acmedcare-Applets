package com.acmedcare.framework.applet.integrate.api.configuration;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.applet.api.exception.InvalidRequestParamException;
import com.acmedcare.framework.applet.api.exception.NotFoundAppletDependencyException;
import com.acmedcare.framework.applet.api.exception.UnSupportedAppletException;
import com.acmedcare.framework.exception.entity.EntityBody;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * {@link AppletsExceptionMapper}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Component
@Provider
public class AppletsExceptionMapper implements ExceptionMapper<RuntimeException> {

  private static final Response NORMAL_RESPONSE =
      Response.status(Response.Status.BAD_REQUEST)
          .entity(
              EntityBody.builder()
                  .status(EntityBody.Status.FAILED)
                  .message("Normal Message")
                  .build())
          .type(MediaType.APPLICATION_JSON)
          .build();

  /**
   * Map an exception to a {@link Response}. Returning {@code null} results in a {@link
   * Response.Status#NO_CONTENT} response. Throwing a runtime exception results in a {@link
   * Response.Status#INTERNAL_SERVER_ERROR} response.
   *
   * @param exception the exception to map to a response.
   * @return a response mapped from the supplied exception.
   */
  @Override
  public Response toResponse(RuntimeException exception) {

    if (exception instanceof AppletException) {

      AppletException appletException = (AppletException) exception;

      // UnSupportedAppletException handler
      if (appletException instanceof UnSupportedAppletException) {
        Response.ResponseBuilder responseBuilder =
            Response.status(Response.Status.BAD_REQUEST)
                .entity(
                    EntityBody.builder()
                        .status(EntityBody.Status.FAILED)
                        .message(appletException.getMessage())
                        .build())
                .type(MediaType.APPLICATION_JSON);

        return responseBuilder.build();
      }

      //
      if (appletException instanceof NotFoundAppletDependencyException) {
        Response.ResponseBuilder responseBuilder =
            Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(
                    EntityBody.builder()
                        .status(EntityBody.Status.EXCEPTION)
                        .message("Applet server not found applet's implements dependency .")
                        .build())
                .type(MediaType.APPLICATION_JSON);

        return responseBuilder.build();
      }

      if(appletException instanceof InvalidRequestParamException) {
        Response.ResponseBuilder responseBuilder =
            Response.status(Response.Status.BAD_REQUEST)
                .entity(
                    EntityBody.builder()
                        .status(EntityBody.Status.FAILED)
                        .message(appletException.getMessage())
                        .build())
                .type(MediaType.APPLICATION_JSON);

        return responseBuilder.build();
      }
    }

    // other system exception

    // TODO

    // normal exception
    return NORMAL_RESPONSE;
  }
}
