package com.acmedcare.framework.applet.integrate.api.endpoints;

import com.acmedcare.framework.applet.api.exception.UnSupportedAppletException;
import com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * {@link AbstractEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public abstract class AbstractEndpoint {

  protected AppletsIntegrateProperties properties;

  @Autowired
  public void setProperties(AppletsIntegrateProperties properties) {
    this.properties = properties;
  }

  /**
   * Check Applet is Supported .
   *
   * @param type applet type.
   */
  void checkAppletType(String type) {
    if (!this.properties.isAppletSupported(type)) {
      throw new UnSupportedAppletException("Applet Type: " + type + " is not supported .");
    }
  }
}
