package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure;

import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRDBService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryProperties.INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AppletsRepositoryAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX,
    matchIfMissing = true,
    name = "enabled",
    havingValue = "true")
@EnableConfigurationProperties(AppletsRepositoryProperties.class)
public class AppletsRepositoryAutoConfiguration {

  @Bean(initMethod = "startup", destroyMethod = "shutdown")
  @ConditionalOnMissingBean(AppletsRDBService.class)
  AppletsRDBService appletsRocksDBService(AppletsRepositoryProperties properties) {
    return new AppletsRDBService(properties);
  }

  // ===== Listeners =====

  static class AppletsRepositoryEventListener
      implements ApplicationListener<SpringApplicationEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
      if (event instanceof ApplicationReadyEvent) {
        ApplicationReadyEvent applicationReadyEvent = (ApplicationReadyEvent) event;
        AppletsRepositoryContext.refresh(
            applicationReadyEvent.getApplicationContext().getBeanFactory(),
            applicationReadyEvent.getApplicationContext().getEnvironment());
      }
    }
  }
}
