package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 群发时用到的图文消息素材.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpMassNews implements Serializable {
  private static final long serialVersionUID = 565937155013581016L;

  private List<WxMpMassNewsArticle> articles = new ArrayList<>();

  public void addArticle(WxMpMassNewsArticle article) {
    this.articles.add(article);
  }

  public String toJson() {
    return WxMpGsonBuilder.create().toJson(this);
  }

  public boolean isEmpty() {
    return this.articles == null || this.articles.isEmpty();
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }

  /**
   *
   *
   * <pre>
   * 群发图文消息article.
   * 1. thumbMediaId  (必填) 图文消息缩略图的media_id，可以在基础支持-上传多媒体文件接口中获得
   * 2. author          图文消息的作者
   * 3. title           (必填) 图文消息的标题
   * 4. contentSourceUrl 在图文消息页面点击“阅读原文”后的页面链接
   * 5. content (必填)  图文消息页面的内容，支持HTML标签
   * 6. digest          图文消息的描述
   * 7, showCoverPic  是否显示封面，true为显示，false为不显示
   * </pre>
   *
   * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
   * @version ${project.version}
   */
  @Data
  public static class WxMpMassNewsArticle {
    /** (必填) 图文消息缩略图的media_id，可以在基础支持-上传多媒体文件接口中获得. */
    private String thumbMediaId;
    /** 图文消息的作者. */
    private String author;
    /** (必填) 图文消息的标题. */
    private String title;
    /** 在图文消息页面点击“阅读原文”后的页面链接. */
    private String contentSourceUrl;
    /** (必填) 图文消息页面的内容，支持HTML标签. */
    private String content;
    /** 图文消息的描述. */
    private String digest;
    /** 是否显示封面，true为显示，false为不显示. */
    private boolean showCoverPic;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }
}
