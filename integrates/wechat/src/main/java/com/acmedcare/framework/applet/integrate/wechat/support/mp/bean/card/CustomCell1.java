package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 自定义会员信息类目.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class CustomCell1 implements Serializable {
  private static final long serialVersionUID = -6446192667149800447L;

  /** 入口名称. */
  @SerializedName("name")
  private String name;

  /** 入口右侧提示语,6个汉字内. */
  @SerializedName("tips")
  private String tips;

  /** 入口跳转链接. */
  @SerializedName("url")
  private String url;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
