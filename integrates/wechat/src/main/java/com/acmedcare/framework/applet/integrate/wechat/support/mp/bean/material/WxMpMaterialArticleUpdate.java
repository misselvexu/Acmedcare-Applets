package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.material;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

@Data
public class WxMpMaterialArticleUpdate implements Serializable {
  private static final long serialVersionUID = -7611963949517780270L;

  private String mediaId;
  private int index;
  private WxMpMaterialNews.WxMpMaterialNewsArticle articles;

  public String toJson() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
