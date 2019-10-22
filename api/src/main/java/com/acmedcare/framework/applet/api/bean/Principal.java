package com.acmedcare.framework.applet.api.bean;

import lombok.*;

import java.io.Serializable;

/**
 * {@link Principal}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Principal implements Serializable {

  /**
   * 基础平台统一的通行证标识
   *
   * <p>
   */
  private String basePlatformPrincipalId;

  /**
   * 基础平台统一授权的通行证Token
   *
   * <p>
   */
  private String basePlatformPrincipalToken;

  @Builder(builderMethodName = "principalNBuilder", buildMethodName = "principalBuild")
  public Principal(String basePlatformPrincipalId, String basePlatformPrincipalToken) {
    this.basePlatformPrincipalId = basePlatformPrincipalId;
    this.basePlatformPrincipalToken = basePlatformPrincipalToken;
  }
}
