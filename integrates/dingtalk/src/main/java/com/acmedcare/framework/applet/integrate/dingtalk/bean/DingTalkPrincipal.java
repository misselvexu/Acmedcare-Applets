package com.acmedcare.framework.applet.integrate.dingtalk.bean;

import com.acmedcare.framework.applet.api.bean.Principal;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {@link DingTalkPrincipal}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/29.
 */
@Getter
@Setter
@NoArgsConstructor
public class DingTalkPrincipal extends Principal {

  private String unionid;

  private String userid;

  private String name;

  private String avatar;

  @Builder
  public DingTalkPrincipal(
      String basePlatformPrincipalId, String unionid, String userid, String name, String avatar) {
    super(basePlatformPrincipalId);
    this.unionid = unionid;
    this.userid = userid;
    this.name = name;
    this.avatar = avatar;
  }
}
