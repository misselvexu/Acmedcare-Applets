package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.integrate.api.annotation.ExtensionEndpoint;
import com.google.common.collect.Sets;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.env.ConfigurableEnvironment;
import xyz.vopen.cartier.classpathscanner.FastClasspathScanner;
import xyz.vopen.cartier.classpathscanner.scanner.ScanResult;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/**
 * {@link AppletsContext}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
public final class AppletsContext {

  private static final Logger log = LoggerFactory.getLogger(AppletsContext.class);

  private static final String SCAN_PACKAGES_PROPERTIES = "applet.integrate.base-packages";

  private static ReentrantLock startupLock = new ReentrantLock();

  private static final long RESTEASY_FRAMEWORK_RELOAD_TIMEOUT = 5000;

  private static AtomicBoolean scanned = new AtomicBoolean(false);

  private static Set<Class<?>> extensionResourcesClassesSet = Sets.newConcurrentHashSet();

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

  static void start(ConfigurableEnvironment environment) {

    if(scanned.compareAndSet(false,true)) {

      String[] packages = environment.getProperty(SCAN_PACKAGES_PROPERTIES,String[].class);

      if(packages != null && packages.length > 0) {

        extensionResourcesClassesSet.clear();

        startupLock.lock();

        try{
          for (String aPackage : packages) {
            doScan(aPackage);
          }

          log.info("[==Applet Context==] Find Optional Extension RESTEasy resource classes: {}" ,extensionResourcesClassesSet.toArray());
        } finally{
          startupLock.unlock();
        }
      }
    }
  }

  private static void doScan(String aPackage) {

    ScanResult scanResult = new FastClasspathScanner(aPackage).scan();

    List<String> extensionEndpointClasses = scanResult.getNamesOfClassesWithAnnotationsAllOf(ExtensionEndpoint.class);

    for (String extensionEndpointClass : extensionEndpointClasses) {
      try {
        extensionResourcesClassesSet.add(Class.forName(extensionEndpointClass));
      } catch (ClassNotFoundException ignored) {
      }
    }
  }

  static Set<Class<?>> loadExtensionResourceClasses() {
    try{
      startupLock.tryLock(RESTEASY_FRAMEWORK_RELOAD_TIMEOUT, TimeUnit.MILLISECONDS);
      return extensionResourcesClassesSet;
    } catch (InterruptedException e) {
      return Sets.newHashSet();
    } finally{
      try{
        startupLock.unlock();
      } catch (Exception ignore) {}
    }
  }

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
