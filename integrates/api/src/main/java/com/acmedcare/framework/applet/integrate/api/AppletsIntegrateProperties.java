package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.integrate.spi.util.StringUtils;
import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

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

  private static final String REGEX_STAR = "*";

  /**
   * Supported Applets Types
   *
   * <p>default: * ; also can config spi implement alias lists , like : a,b,c
   */
  private Set<String> supportedApplets = Sets.newHashSet(REGEX_STAR);

  /**
   * Check Applet is Supported
   *
   * @param type applet type
   * @return supported return true , otherwise return false
   */
  public boolean isAppletSupported(String type) {
    if (StringUtils.hasText(type) && supportedApplets.contains(REGEX_STAR)) {
      return true;
    }
    return StringUtils.hasText(type) && supportedApplets.contains(type);
  }
}
