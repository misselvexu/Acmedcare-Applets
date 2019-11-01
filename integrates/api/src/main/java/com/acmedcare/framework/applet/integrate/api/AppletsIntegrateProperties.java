package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.integrate.common.spi.util.StringUtils;
import com.acmedcare.framework.kits.Assert;
import com.acmedcare.nas.client.NasProperties;
import com.google.common.collect.Sets;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.File;
import java.io.Serializable;
import java.util.Set;

import static com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;

/**
 * {@link AppletsIntegrateProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX)
public class AppletsIntegrateProperties implements InitializingBean {

  private static final Logger logger = LoggerFactory.getLogger(AppletsIntegrateProperties.class);

  static final String INTEGRATE_PROPERTIES_CONFIG_PREFIX = "applet.integrate";

  private boolean enabled = false;

  /**
   * Applet Base Scan Packages Defined
   *
   * <p>
   */
  private String[] basePackages;

  private static final String REGEX_STAR = "*";

  /**
   * Supported Applets Types
   *
   * <p>default: * ; also can config spi implement alias lists , like : a,b,c
   */
  private Set<String> supportedAppletTypes = Sets.newHashSet(REGEX_STAR);

  @NestedConfigurationProperty private FileStorageProperties fileStorageConfig;

  /**
   * Check Applet is Supported
   *
   * @param type applet type
   * @return supported return true , otherwise return false
   */
  public boolean isAppletSupported(String type) {
    if (StringUtils.hasText(type) && supportedAppletTypes.contains(REGEX_STAR)) {
      return true;
    }
    return StringUtils.hasText(type) && supportedAppletTypes.contains(type);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    if(fileStorageConfig != null) {
      fileStorageConfig.recheck();
    }
  }

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class FileStorageProperties extends NasProperties implements Serializable {

    static final String NAS_CONDITIONAL_PREFIX = "applet.integrate.file-storage-config";

    private static final String DEFAULT_APPLET_STORAGE_HOME = System.getProperty("user.home");

    private static final String FILE_BASE_DIR = "applets/files/";

    /**
     * File Storage Type ,default is local storage
     *
     * <p>
     */
    private FileStorageType type = FileStorageType.DEFAULT;

    /**
     * Local Storage Dir
     *
     * <p>
     */
    private String localStoragePath;

    /**
     * File Publish Url Prefix
     *
     * <p>
     */
    private String filePublishUri;

    void recheck() {

      if(type == null) {
        this.type = FileStorageType.DEFAULT;
      }

      // default check
      if(type.equals(FileStorageType.DEFAULT)) {

        if(com.acmedcare.framework.kits.StringUtils.isBlank(localStoragePath)) {

          this.localStoragePath =
              DEFAULT_APPLET_STORAGE_HOME.endsWith("/")
                  ? DEFAULT_APPLET_STORAGE_HOME.concat(FILE_BASE_DIR)
                  : DEFAULT_APPLET_STORAGE_HOME.concat(File.separator).concat(FILE_BASE_DIR);

        }

        Assert.isTrue(com.acmedcare.framework.kits.StringUtils.isNotBlank(this.localStoragePath));

        File localStorageDirectory = new File(this.localStoragePath);

        if(!localStorageDirectory.exists()) {

          logger.info("[==Applets LocalFile==] create dir:{} result: {}" , this.localStoragePath ,localStorageDirectory.mkdirs());

        }

      }

      // NAS CHECK
      if(type.equals(FileStorageType.NAS)) {

        if(org.apache.commons.lang3.StringUtils.isAnyBlank(getAppId(), getAppKey())) {
          throw new IllegalArgumentException("[==Applet NasFile==] file storage type is nas, properties 'appId' & 'appKey' must not be null or blank.");
        }

        if(getServerAddrs().isEmpty()) {
          throw new IllegalArgumentException("[==Applet NasFile==] file storage type is nas, property 'serverAddrs' must not be empty .");
        }

      }

    }
  }

  public enum FileStorageType {

    /** Default， local storage */
    DEFAULT,

    /** Acmedcare+ Nas File System */
    NAS
  }
}
