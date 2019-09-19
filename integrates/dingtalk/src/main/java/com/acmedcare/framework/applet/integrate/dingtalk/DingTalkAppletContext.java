package com.acmedcare.framework.applet.integrate.dingtalk;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * {@link DingTalkAppletContext}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public final class DingTalkAppletContext {

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
  @Getter private DingTalkIntegrateProperties properties;

  static void refresh(
      ConfigurableListableBeanFactory beanFactory, ConfigurableEnvironment environment) {
    context().beanFactory = beanFactory;
    context().environment = environment;
    context().properties = beanFactory.getBean(DingTalkIntegrateProperties.class);
  }

  private DingTalkAppletContext() {}

  private static class InstanceHolder {
    private static final DingTalkAppletContext INSTANCE = new DingTalkAppletContext();
  }

  /**
   * Return instance of {@link DingTalkAppletContext}
   *
   * @return context instance
   */
  public static DingTalkAppletContext context() {
    return InstanceHolder.INSTANCE;
  }
}
