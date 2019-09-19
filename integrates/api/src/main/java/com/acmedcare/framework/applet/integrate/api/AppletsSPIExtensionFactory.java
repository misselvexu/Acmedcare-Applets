package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.api.exception.NotFoundAppletDependencyException;
import com.acmedcare.framework.applet.api.exception.UnSupportedAppletException;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;
import com.acmedcare.framework.applet.integrate.api.spi.PrincipalService;
import com.acmedcare.framework.applet.integrate.spi.Extensible;
import com.acmedcare.framework.applet.integrate.spi.ExtensionLoader;
import com.acmedcare.framework.applet.integrate.spi.ExtensionLoaderFactory;
import com.acmedcare.framework.applet.integrate.spi.util.StringUtils;
import com.acmedcare.framework.kits.lang.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;

/**
 * {@link AppletsSPIExtensionFactory}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@SuppressWarnings({"unchecked", "unused"})
public final class AppletsSPIExtensionFactory {

  private static final Logger log = LoggerFactory.getLogger(AppletsSPIExtensionFactory.class);

  private static ExtensionLoader<AuthService> authServiceExtensionLoader;

  private static ExtensionLoader<PrincipalService> principalServiceExtensionLoader;

  private static BeanFactory beanFactory;

  static void refresh(BeanFactory beanFactory) {
    AppletsSPIExtensionFactory.beanFactory = beanFactory;
    authServiceExtensionLoader = buildAuthServiceExtensionLoader();
    log.info("[==Applets SPI==] AuthService instance is build-ed.");
    principalServiceExtensionLoader = buildPrincipalServiceExtensionLoader();
    log.info("[==Applets SPI==] PrincipalService instance is build-ed.");
  }

  private static ExtensionLoader<PrincipalService> buildPrincipalServiceExtensionLoader() {
    return ExtensionLoaderFactory.getExtensionLoader(PrincipalService.class);
  }

  private static ExtensionLoader<AuthService> buildAuthServiceExtensionLoader() {
    return ExtensionLoaderFactory.getExtensionLoader(AuthService.class);
  }

  /**
   * Get SPI Service Instance from extension loader Factory
   *
   * @param alias spi implements alias name
   * @param clazz spi service class type
   * @param <T> TYPE
   * @return instance of service
   * @throws NotFoundAppletDependencyException maybe thrown {@link
   *     NotFoundAppletDependencyException}
   * @throws UnSupportedAppletException maybe thrown {@link UnSupportedAppletException}
   * @see AuthService
   * @see PrincipalService
   */
  public static @NonNull <T> T getService(String alias, Class<T> clazz)
      throws NotFoundAppletDependencyException, UnSupportedAppletException {

    if (clazz == null || !StringUtils.hasText(alias)) {
      throw new UnSupportedAppletException("Applet type must not be null or blank .");
    }

    if (!clazz.isAnnotationPresent(Extensible.class)) {
      log.warn("[==Applets SPI==] Annotation '@Extensible' is not present on class: {}", clazz);
      throw new NotFoundAppletDependencyException();
    }

    if (clazz.equals(AuthService.class)) {
      return (T) authServiceExtensionLoader.getExtension(alias);
    }

    if (clazz.equals(PrincipalService.class)) {
      return (T) principalServiceExtensionLoader.getExtension(alias);
    }

    // without extension
    throw new NotFoundAppletDependencyException();
  }
}
