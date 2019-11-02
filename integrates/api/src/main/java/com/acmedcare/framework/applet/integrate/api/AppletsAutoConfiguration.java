package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.api.exception.AppletException;
import com.acmedcare.framework.kits.BeanUtils;
import com.acmedcare.framework.kits.lang.NonNull;
import com.acmedcare.nas.client.NasClient;
import com.acmedcare.nas.client.NasClientFactory;
import com.acmedcare.nas.client.NasProperties;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
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

import static com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties.FileStorageProperties.NAS_CONDITIONAL_PREFIX;
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

  @Bean
  @ConditionalOnClass(name = {"com.acmedcare.nas.client.NasClient"})
  @ConditionalOnProperty(prefix = NAS_CONDITIONAL_PREFIX, name = "type", havingValue = "nas")
  public NasClient nasClient(AppletsIntegrateProperties properties) {

    AppletsIntegrateProperties.FileStorageProperties storageProperties = properties.getFileStorageConfig();

    if (storageProperties.getNasConfig() == null) {
      throw new AppletException(
          "[==Applet NasFile==] file storage type is nas, nas config properties ['applet.integrate.file-storage-config.nas-config....'] must not be null . ");
    }

    if(StringUtils.isAnyBlank(storageProperties.getNasConfig().getAppId(), storageProperties.getNasConfig().getAppKey())) {
      throw new IllegalArgumentException("[==Applet Nas==] file storage type is nas, properties 'appId' & 'appKey' must not be null or blank.");
    }

    if(storageProperties.getNasConfig().getServerAddrs().isEmpty()) {
      throw new IllegalArgumentException("[==Applet Nas==] file storage type is nas, property 'serverAddrs' must not be empty .");
    }

    NasProperties nasProperties = new NasProperties();
    BeanUtils.copyProperties(storageProperties.getNasConfig(),nasProperties);

    return NasClientFactory.createNewNasClient(nasProperties);
  }

  static class AppletsEventListener implements ApplicationListener<SpringApplicationEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(@NonNull SpringApplicationEvent event) {
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
