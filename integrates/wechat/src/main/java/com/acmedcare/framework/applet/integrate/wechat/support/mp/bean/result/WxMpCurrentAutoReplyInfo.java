package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxBooleanTypeAdapter;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxDateTypeAdapter;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * <pre>
 * 公众号的自动回复规则.
 * Created by Acmedcare+ Developer on 2017-7-8.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpCurrentAutoReplyInfo implements Serializable {
  private static final long serialVersionUID = 8294705001262751638L;

  @SerializedName("is_add_friend_reply_open")
  @JsonAdapter(WxBooleanTypeAdapter.class)
  private Boolean isAddFriendReplyOpen;

  @SerializedName("is_autoreply_open")
  @JsonAdapter(WxBooleanTypeAdapter.class)
  private Boolean isAutoReplyOpen;

  @SerializedName("add_friend_autoreply_info")
  private AutoReplyInfo addFriendAutoReplyInfo;

  @SerializedName("message_default_autoreply_info")
  private AutoReplyInfo messageDefaultAutoReplyInfo;

  @SerializedName("keyword_autoreply_info")
  private KeywordAutoReplyInfo keywordAutoReplyInfo;

  public static WxMpCurrentAutoReplyInfo fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpCurrentAutoReplyInfo.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }

  @Data
  public static class AutoReplyRule implements Serializable {
    private static final long serialVersionUID = -6415971838145909046L;

    @SerializedName("rule_name")
    private String ruleName;

    @SerializedName("create_time")
    @JsonAdapter(WxDateTypeAdapter.class)
    private Date createTime;

    @SerializedName("reply_mode")
    private String replyMode;

    @SerializedName("keyword_list_info")
    private List<KeywordInfo> keywordListInfo;

    @SerializedName("reply_list_info")
    private List<ReplyInfo> replyListInfo;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }

  @Data
  public static class ReplyInfo implements Serializable {
    private static final long serialVersionUID = -3429575601599101690L;
    private String type;
    private String content;

    @SerializedName("news_info")
    private NewsInfo newsInfo;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }

  @Data
  public static class NewsInfo implements Serializable {
    private static final long serialVersionUID = 2958827725972593328L;
    private List<NewsItem> list;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }

  @Data
  public static class NewsItem implements Serializable {
    private static final long serialVersionUID = -680356309029767176L;

    @SerializedName("cover_url")
    private String coverUrl;

    private String author;

    @SerializedName("content_url")
    private String contentUrl;

    private String digest;

    @SerializedName("show_cover")
    @JsonAdapter(WxBooleanTypeAdapter.class)
    private Boolean showCover;

    @SerializedName("source_url")
    private String sourceUrl;

    private String title;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }

  @Data
  public static class KeywordInfo implements Serializable {
    private static final long serialVersionUID = 7720246983986706379L;
    private String type;

    @SerializedName("match_mode")
    private String matchMode;

    private String content;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }

  @Data
  public static class KeywordAutoReplyInfo implements Serializable {
    private static final long serialVersionUID = -8789197949404753083L;
    private List<AutoReplyRule> list;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }

  @Data
  public static class AutoReplyInfo implements Serializable {
    private static final long serialVersionUID = 4993719555937843712L;
    private String type;
    private String content;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }
}
