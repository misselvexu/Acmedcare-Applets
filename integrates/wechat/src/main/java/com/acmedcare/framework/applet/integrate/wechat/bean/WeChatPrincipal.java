package com.acmedcare.framework.applet.integrate.wechat.bean;

import com.acmedcare.framework.applet.api.bean.Principal;
import lombok.*;

/**
 * {@link WeChatPrincipal}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/10/30.
 */
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class WeChatPrincipal extends Principal {

  private String unionid;

  private String openid;

  private String sessionKey;

  @Builder
  public WeChatPrincipal(String basePlatformPrincipalId, String basePlatformPrincipalToken, String unionid, String openid, String sessionKey) {
    super(basePlatformPrincipalId, basePlatformPrincipalToken);
    this.unionid = unionid;
    this.openid = openid;
    this.sessionKey = sessionKey;
  }
}
