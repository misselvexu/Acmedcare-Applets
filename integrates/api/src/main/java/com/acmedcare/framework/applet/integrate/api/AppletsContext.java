package com.acmedcare.framework.applet.integrate.api;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * {@link AppletsContext}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public final class AppletsContext {

  /**
   * Return the {@code Environment} for this application context in configurable form, allowing for
   * further customization.
   */
  private ConfigurableEnvironment environment;

  /**
   * Return the internal bean factory of this application context. Can be used to access specific
   * functionality of the underlying factory.
   *
   * <p>Note: Do not use this to post-process the bean factory; singletons will already have been
   * instantiated before. Use a BeanFactoryPostProcessor to intercept the BeanFactory setup process
   * before beans get touched.
   */
  private BeanFactory beanFactory;

  /**
   * DingTalk Integrate Properties Instance
   *
   * <p>
   */
  @Getter private AppletsIntegrateProperties properties;

  static void refresh(
      ConfigurableListableBeanFactory beanFactory, ConfigurableEnvironment environment) {
    context().beanFactory = beanFactory;
    context().environment = environment;
    context().properties = beanFactory.getBean(AppletsIntegrateProperties.class);
  }

  private AppletsContext() {}

  private static class InstanceHolder {
    private static final AppletsContext INSTANCE = new AppletsContext();
  }

  /**
   * Return instance of {@link AppletsContext}
   *
   * @return context instance
   */
  public static AppletsContext context() {
    return InstanceHolder.INSTANCE;
  }
}
