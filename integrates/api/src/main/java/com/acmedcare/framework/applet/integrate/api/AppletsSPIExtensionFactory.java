package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.api.exception.NotFoundAppletDependencyException;
import com.acmedcare.framework.applet.api.exception.UnSupportedAppletException;
import com.acmedcare.framework.applet.integrate.api.spi.AuthService;
import com.acmedcare.framework.applet.integrate.api.spi.PrincipalService;
import com.acmedcare.framework.applet.integrate.common.spi.Extensible;
import com.acmedcare.framework.applet.integrate.common.spi.ExtensionLoader;
import com.acmedcare.framework.applet.integrate.common.spi.ExtensionLoaderFactory;
import com.acmedcare.framework.applet.integrate.common.spi.util.StringUtils;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import com.acmedcare.framework.kits.lang.NonNull;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

import static com.acmedcare.framework.applet.integrate.storage.api.AppletsRepositoryConstants.DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME;

/**
 * {@link AppletsSPIExtensionFactory}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@SuppressWarnings({"unchecked", "unused"})
public final class AppletsSPIExtensionFactory {

  private static final Logger log = LoggerFactory.getLogger(AppletsSPIExtensionFactory.class);

  private static final String APPLETS_ENABLED_ENV_PROPERTIES_KEY = "applet.integrate.enabled";

  private static final String SPI_IMPLEMENTS_ENABLED_ENV_PROPERTIES_KEY = "applet.integrate.%s.enabled";

  private static final Map<String, Boolean> CUSTOMER_APPLET_ENABLED_CACHE = Maps.newHashMap();

  private static ExtensionLoader<AuthService> authServiceExtensionLoader;

  private static ExtensionLoader<PrincipalService> principalServiceExtensionLoader;

  private static ExtensionLoader<AppletsRepository> appletsRepositoryExtensionLoader;

  private static ConfigurableApplicationContext context;

  private static volatile Boolean appletsEnabled = false;

  static void refresh(ConfigurableApplicationContext context) {
    AppletsSPIExtensionFactory.context = context;
    authServiceExtensionLoader = buildAuthServiceExtensionLoader();
    log.info("[==Applets SPI==] AuthService instance is build-ed.");
    principalServiceExtensionLoader = buildPrincipalServiceExtensionLoader();
    log.info("[==Applets SPI==] PrincipalService instance is build-ed.");
    appletsRepositoryExtensionLoader = buildAppletsRepositoryExtensionLoader();
    log.info("[==Applets SPI==] AppletsRepository instance is build-ed.");

    appletsEnabled =
        context
            .getEnvironment()
            .getProperty(APPLETS_ENABLED_ENV_PROPERTIES_KEY, Boolean.class, false);
  }

  private static ExtensionLoader<PrincipalService> buildPrincipalServiceExtensionLoader() {
    return ExtensionLoaderFactory.getExtensionLoader(PrincipalService.class);
  }

  private static ExtensionLoader<AuthService> buildAuthServiceExtensionLoader() {
    return ExtensionLoaderFactory.getExtensionLoader(AuthService.class);
  }

  private static ExtensionLoader<AppletsRepository> buildAppletsRepositoryExtensionLoader() {
    return ExtensionLoaderFactory.getExtensionLoader(AppletsRepository.class);
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

    /*
    if(!appletsEnabled) {
      throw new UnSupportedAppletException(
          "Applet server not found config properties <applet.integrate.enabled=true> on environment");
    }
    */

    String envKey = String.format(SPI_IMPLEMENTS_ENABLED_ENV_PROPERTIES_KEY, alias);

    if (!checkAndSet(envKey)) {
      throw new UnSupportedAppletException(
          "Applet server not found config properties <" + envKey + "=true> on environment");
    }

    if (clazz.equals(AuthService.class)) {
      return (T) authServiceExtensionLoader.getExtension(alias);
    }

    if (clazz.equals(PrincipalService.class)) {
      return (T) principalServiceExtensionLoader.getExtension(alias);
    }

    if (clazz.equals(AppletsRepository.class)) {
      return (T) appletsRepositoryExtensionLoader.getExtension(alias);
    }

    // without extension
    throw new NotFoundAppletDependencyException();
  }

  /**
   * Get Default SPI Applets Repository Instance from extension loader Factory
   *
   * @param clazz spi service class type
   * @param <T> TYPE
   * @return instance of service
   * @throws NotFoundAppletDependencyException maybe thrown {@link
   *     NotFoundAppletDependencyException}
   * @throws UnSupportedAppletException maybe thrown {@link UnSupportedAppletException}
   * @see AuthService
   * @see PrincipalService
   */
  public static @NonNull <T> T getRepository(Class<T> clazz)
      throws NotFoundAppletDependencyException, UnSupportedAppletException {
    return getRepository(DEFAULT_REPOSITORY_IMPLEMENTS_ALIAS_NAME, clazz);
  }

  /**
   * Get Assigned SPI Applets Repository Instance from extension loader Factory
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
  public static @NonNull <T> T getRepository(String alias, Class<T> clazz)
      throws NotFoundAppletDependencyException, UnSupportedAppletException {
    return getService(alias, clazz);
  }

  private static boolean checkAndSet(@NonNull String key) {
    if (CUSTOMER_APPLET_ENABLED_CACHE.containsKey(key)) {
      return CUSTOMER_APPLET_ENABLED_CACHE.get(key);
    } else {
      Boolean value = context.getEnvironment().getProperty(key, Boolean.class, Boolean.FALSE);
      CUSTOMER_APPLET_ENABLED_CACHE.put(key, value);
      return value;
    }
  }
}
