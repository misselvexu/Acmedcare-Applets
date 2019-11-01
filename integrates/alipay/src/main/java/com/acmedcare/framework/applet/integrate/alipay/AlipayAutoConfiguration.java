package com.acmedcare.framework.applet.integrate.alipay;

import com.acmedcare.framework.kits.lang.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import static com.acmedcare.framework.applet.integrate.alipay.AlipayIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AlipayAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX,
    name = "enabled",
    havingValue = "true")
@EnableConfigurationProperties(AlipayIntegrateProperties.class)
@ComponentScan(basePackageClasses = AlipayIntegrateProperties.class)
public class AlipayAutoConfiguration implements ApplicationContextAware {

  private static final Logger log = LoggerFactory.getLogger(AlipayAutoConfiguration.class);

  private ApplicationContext applicationContext;

  @EventListener
  public void onApplicationReadyEvent(ApplicationReadyEvent event) {
    AlipayAppletContext.refresh(
        event.getApplicationContext().getBeanFactory(),
        event.getApplicationContext().getEnvironment());
    log.info("[==Alipay Applet==] alipay context is refreshed.");
  }

  // =========== Normal Override Method ===========

  @Override
  public void setApplicationContext(@NonNull ApplicationContext applicationContext)
      throws BeansException {
    this.applicationContext = applicationContext;
  }
}
