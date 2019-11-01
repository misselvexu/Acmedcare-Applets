package com.acmedcare.framework.applet.integrate.alipay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@link AlipayIntegrateProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = AlipayIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX)
public class AlipayIntegrateProperties {

  static final String INTEGRATE_PROPERTIES_CONFIG_PREFIX = "applet.integrate.alipay";

  private boolean enabled = false;


  // ======= Supported Properties Defined =======


}
