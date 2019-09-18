package com.acmedcare.framework.applet.integrate.aorp.response;

import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import lombok.Builder;

import java.util.Date;

/**
 * {@link DefaultAppletResponse}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/18.
 */
public class DefaultAppletResponse extends AppletResponse<String, String> {

  /**
   * Default Constructor
   *
   * <p>WARN: if you want to use {@link AppletResponse#appletResponseBuilder()} to create new
   * response instance , you must add this default constructor
   */
  @Builder
  public DefaultAppletResponse(Status status, Date timestamp, String message, String data) {
    super(status, timestamp, message, data);
  }
}
