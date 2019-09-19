package com.acmedcare.framework.applet.integrate.aorp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.acmedcare.framework.applet.integrate.aorp.DefaultAppletIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link DefaultAppletIntegrateProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX)
public class DefaultAppletIntegrateProperties {

  static final String INTEGRATE_PROPERTIES_CONFIG_PREFIX = "applet.integrate.aorp";

  private boolean enabled = true;
}
