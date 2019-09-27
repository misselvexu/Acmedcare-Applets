package com.acmedcare.framework.applet.integrate.dingtalk;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.lang.NonNull;

/**
 * {@link DingTalkAppletContext}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public final class DingTalkAppletContext implements BeanFactory {

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

  // === BeanFactories' Delegation(s) ===

  @Override
  public Object getBean(@NonNull String name) throws BeansException {
    return beanFactory.getBean(name);
  }

  @Override
  public <T> T getBean(@NonNull String name, Class<T> requiredType) throws BeansException {
    return beanFactory.getBean(name, requiredType);
  }

  @Override
  public Object getBean(@NonNull String name, Object... args) throws BeansException {
    return beanFactory.getBean(name, args);
  }

  @Override
  public <T> T getBean(@NonNull Class<T> requiredType) throws BeansException {
    return beanFactory.getBean(requiredType);
  }

  @Override
  public <T> T getBean(@NonNull Class<T> requiredType, Object... args) throws BeansException {
    return beanFactory.getBean(requiredType, args);
  }

  @Override
  public boolean containsBean(@NonNull String name) {
    return beanFactory.containsBean(name);
  }

  @Override
  public boolean isSingleton(@NonNull String name) throws NoSuchBeanDefinitionException {
    return beanFactory.isSingleton(name);
  }

  @Override
  public boolean isPrototype(@NonNull String name) throws NoSuchBeanDefinitionException {
    return beanFactory.isPrototype(name);
  }

  @Override
  public boolean isTypeMatch(@NonNull String name, @NonNull ResolvableType typeToMatch)
      throws NoSuchBeanDefinitionException {
    return beanFactory.isTypeMatch(name, typeToMatch);
  }

  @Override
  public boolean isTypeMatch(@NonNull String name, Class<?> typeToMatch)
      throws NoSuchBeanDefinitionException {
    return beanFactory.isTypeMatch(name, typeToMatch);
  }

  @Override
  public Class<?> getType(@NonNull String name) throws NoSuchBeanDefinitionException {
    return beanFactory.getType(name);
  }

  @Override
  public String[] getAliases(@NonNull String name) {
    return beanFactory.getAliases(name);
  }
}
