package com.acmedcare.framework.applet.api.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * {@link Principal}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Getter
@Setter
@NoArgsConstructor
public class Principal implements Serializable {

  /**
   * 基础平台统一的通行证标识
   *
   * <p>
   */
  private String basePlatformPrincipalId;

  @Builder(builderMethodName = "principalNBuilder", buildMethodName = "principalBuild")
  public Principal(String basePlatformPrincipalId) {
    this.basePlatformPrincipalId = basePlatformPrincipalId;
  }
}
