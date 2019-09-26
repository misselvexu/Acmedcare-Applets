package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure;

import com.acmedcare.framework.applet.integrate.common.spi.util.StringUtils;
import com.acmedcare.framework.kits.annotation.JustForTest;
import com.google.common.annotations.Beta;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.File;

import static com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryProperties.INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AppletsRepositoryProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX)
public class AppletsRepositoryProperties {

  static final String INTEGRATE_REPOSITORY_PROPERTIES_CONFIG_PREFIX = "applet.integrate.repository";

  private static final Logger log = LoggerFactory.getLogger(AppletsRepositoryProperties.class);

  /**
   * Default Repository Enabled Flag
   *
   * <p>default: true
   */
  private boolean enabled = true;

  /**
   * RockdDB Config Properties
   *
   * <p>
   */
  @NestedConfigurationProperty
  private RocksDBConfigProperties rdbConfig = new RocksDBConfigProperties();

  // ===== RocksDB Config Bean Defined ======

  /**
   * RockdDB Config Properties {@link RocksDBConfigProperties}
   *
   * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
   * @since 2.1.0
   */
  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class RocksDBConfigProperties implements InitializingBean {

    private static final String DEFAULT_STORAGE_PATH = System.getProperty("user.home");

    private static final String DEFAULT_RDB_BASE_PATH = "APPLETS_RDB";

    /**
     * DB Storage File Path
     *
     * <p>default: {@link RocksDBConfigProperties#DEFAULT_STORAGE_PATH} + '/' + {@link
     * RocksDBConfigProperties#DEFAULT_RDB_BASE_PATH}
     */
    private String storagePath;

    @Beta @JustForTest private String password;

    /**
     * Invoked by the containing {@code BeanFactory} after it has set all bean properties and
     * satisfied {@link BeanFactoryAware}, {@code ApplicationContextAware} etc.
     *
     * <p>This method allows the bean instance to perform validation of its overall configuration
     * and final initialization when all bean properties have been set.
     *
     * @throws Exception in the event of misconfiguration (such as failure to set an essential
     *     property) or if initialization fails for any other reason
     */
    @Override
    public void afterPropertiesSet() throws Exception {

      if (!StringUtils.hasText(storagePath)) {
        this.storagePath =
            DEFAULT_STORAGE_PATH.endsWith("/")
                ? DEFAULT_STORAGE_PATH.concat(DEFAULT_RDB_BASE_PATH)
                : DEFAULT_STORAGE_PATH.concat(File.separator).concat(DEFAULT_RDB_BASE_PATH);
      }

      log.info("[==Applets RDB==] Config: {}", this);
    }
  }
}
