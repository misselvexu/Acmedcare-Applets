package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.applet.integrate.common.spi.util.StringUtils;
import com.google.common.collect.Sets;
import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
public class AppletsIntegrateProperties {

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

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class FileProperties implements Serializable {

    /**
     * File Storage Type ,default is local storage
     *
     * <p>
     */
    private FileStorageType storageType = FileStorageType.DEFAULT;


    private String fileStorageDir;
  }

  public enum FileStorageType {

    /** Default， local storage */
    DEFAULT,

    /** Acmedcare+ Nas File System */
    NAS
  }
}
