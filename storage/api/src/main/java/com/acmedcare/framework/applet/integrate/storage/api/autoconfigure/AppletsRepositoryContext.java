package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * {@link AppletsRepositoryContext}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
public final class AppletsRepositoryContext {

  private static final Logger log = LoggerFactory.getLogger(AppletsRepositoryContext.class);

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
   * Repository Integrate Properties Instance
   *
   * <p>
   */
  @Getter private AppletsRepositoryProperties properties;

  /**
   * Repository Context Refresh Method
   *
   * @param beanFactory spring {@link BeanFactory} instance
   * @param environment spring {@link ConfigurableEnvironment} instance
   */
  static void refresh(
      ConfigurableListableBeanFactory beanFactory, ConfigurableEnvironment environment) {
    context().beanFactory = beanFactory;
    context().environment = environment;
    context().properties = beanFactory.getBean(AppletsRepositoryProperties.class);
  }

  private AppletsRepositoryContext() {}

  private static class InstanceHolder {
    private static final AppletsRepositoryContext INSTANCE = new AppletsRepositoryContext();
  }

  /**
   * Return instance of {@link AppletsRepositoryContext}
   *
   * @return context instance
   */
  public static AppletsRepositoryContext context() {
    return InstanceHolder.INSTANCE;
  }
}
