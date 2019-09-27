package com.acmedcare.framework.applet.integrate.aorp.bean;

import com.acmedcare.framework.applet.api.bean.Principal;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {@link DefaultPrincipal}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@Getter
@Setter
@NoArgsConstructor
public class DefaultPrincipal extends Principal {

  private Long passportId;

  private String passport;

  @Builder
  public DefaultPrincipal(Long passportId, String passport) {
    this.passportId = passportId;
    this.passport = passport;
  }
}
