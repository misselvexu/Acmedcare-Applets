package com.acmedcare.framework.applet.integrate.dingtalk;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@link DingTalkIntegrateProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = DingTalkIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX)
public class DingTalkIntegrateProperties {

  static final String INTEGRATE_PROPERTIES_CONFIG_PREFIX = "applet.integrate.dingtalk";

  private boolean enabled = false;

  private String appId;

  private String suiteId;

  /**
   * 应用的SuiteKey，登录开发者后台，点击应用管理，进入应用详情可见
   *
   * <p>
   */
  private String suiteKey;

  /**
   * 应用的SuiteSecret，登录开发者后台，点击应用管理，进入应用详情可见
   *
   * <p>
   */
  private String suiteSecret;

  /**
   * 回调URL加解密用。应用的数据加密密钥，登录开发者后台，点击应用管理，进入应用详情可见
   *
   * <p>
   */
  private String callbackUrlAesKey;

  /**
   * 回调URL签名用。应用的签名Token, 登录开发者后台，点击应用管理，进入应用详情可见
   *
   * <p>
   */
  private String callbackUrlSignToken;
}
