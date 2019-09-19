package com.acmedcare.framework.applet.integrate.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import static com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AppletsAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX,
    name = "enabled",
    havingValue = "true")
@ConditionalOnMissingBean(AppletsAutoConfiguration.class)
@EnableConfigurationProperties(AppletsIntegrateProperties.class)
@ComponentScan(basePackageClasses = AppletsIntegrateProperties.class)
public class AppletsAutoConfiguration {

  @EventListener
  @ConditionalOnProperty(
      prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX,
      name = "enabled",
      havingValue = "true")
  public void onApplicationStartedUp(ApplicationReadyEvent event) {
    AppletsContext.refresh(event.getApplicationContext().getBeanFactory(), event.getApplicationContext().getEnvironment());
    AppletsSPIExtensionFactory.refresh(event.getApplicationContext());
  }
}
