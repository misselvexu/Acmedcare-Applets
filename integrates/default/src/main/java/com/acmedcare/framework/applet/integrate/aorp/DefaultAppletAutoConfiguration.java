package com.acmedcare.framework.applet.integrate.aorp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.acmedcare.framework.applet.integrate.aorp.DefaultAppletIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link DefaultAppletAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX,
    name = "enabled",
    havingValue = "true")
@EnableConfigurationProperties(DefaultAppletIntegrateProperties.class)
@ComponentScan(basePackageClasses = DefaultAppletIntegrateProperties.class)
public class DefaultAppletAutoConfiguration {}
