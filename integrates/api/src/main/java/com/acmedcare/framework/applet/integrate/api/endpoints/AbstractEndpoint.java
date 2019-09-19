package com.acmedcare.framework.applet.integrate.api.endpoints;

import com.acmedcare.framework.applet.api.exception.UnSupportedAppletException;
import com.acmedcare.framework.applet.integrate.api.AppletsContext;

/**
 * {@link AbstractEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public abstract class AbstractEndpoint {

  /**
   * Check Applet is Supported .
   *
   * @param type applet type.
   */
  void checkAppletType(String type) {
    if (!AppletsContext.context().getProperties().isAppletSupported(type)) {
      throw new UnSupportedAppletException("Applet Type <" + type + "> is not supported .");
    }
  }
}
