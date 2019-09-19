package com.acmedcare.framework.applet.integrate.api;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
@EnableConfigurationProperties(AppletsIntegrateProperties.class)
@ComponentScan(basePackageClasses = AppletsIntegrateProperties.class)
public class AppletsAutoConfiguration {

  @Configuration
  @AutoConfigureBefore(ServletWebServerFactoryAutoConfiguration.class)
  static class AppletsEndpointApplicationAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(AppletsEndpointApplication.class)
    AppletsEndpointApplication appletsEndpointApplication() {
      return new AppletsEndpointApplication();
    }
  }

  static class AppletsEventListener implements ApplicationListener<SpringApplicationEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
      if(event instanceof ApplicationEnvironmentPreparedEvent) {
        ApplicationEnvironmentPreparedEvent environmentPreparedEvent = (ApplicationEnvironmentPreparedEvent) event;
        AppletsContext.start(environmentPreparedEvent.getEnvironment());
      }

      if(event instanceof ApplicationReadyEvent) {
        ApplicationReadyEvent applicationReadyEvent = (ApplicationReadyEvent) event;
        AppletsContext.refresh(
            applicationReadyEvent.getApplicationContext().getBeanFactory(),
            applicationReadyEvent.getApplicationContext().getEnvironment());
        AppletsSPIExtensionFactory.refresh(applicationReadyEvent.getApplicationContext());
      }
    }
  }
}
