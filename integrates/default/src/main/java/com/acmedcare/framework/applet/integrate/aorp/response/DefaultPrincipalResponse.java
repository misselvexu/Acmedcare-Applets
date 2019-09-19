package com.acmedcare.framework.applet.integrate.aorp.response;

import com.acmedcare.framework.applet.integrate.aorp.bean.DefaultPrincipal;
import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import lombok.Builder;

import java.util.Date;

/**
 * {@link DefaultPrincipalResponse}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public class DefaultPrincipalResponse extends AppletResponse<DefaultPrincipal, String> {

  @Builder
  public DefaultPrincipalResponse(
      Status status, Date timestamp, String message, DefaultPrincipal data) {
    super(status, timestamp, message, data);
  }
}
