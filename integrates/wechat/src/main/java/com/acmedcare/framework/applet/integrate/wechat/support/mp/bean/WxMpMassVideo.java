package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * 群发时用到的视频素材
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpMassVideo implements Serializable {
  private static final long serialVersionUID = 9153925016061915637L;

  private String mediaId;
  private String title;
  private String description;

  public String toJson() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
