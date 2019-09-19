package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.integrate.spi.util.StringUtils;
import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

import static com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AppletsIntegrateProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX)
public class AppletsIntegrateProperties {

  static final String INTEGRATE_PROPERTIES_CONFIG_PREFIX = "applet.integrate";

  private boolean enabled = false;

  /**
   * Supported Applets Types
   *
   * <p>
   */
  private List<String> supportedApplets = Lists.newArrayList();

  /**
   * Check Applet is Supported
   *
   * @param type applet type
   * @return supported return true , otherwise return false
   */
  public boolean isAppletSupported(String type) {
    return StringUtils.hasText(type) && supportedApplets.contains(type);
  }
}
