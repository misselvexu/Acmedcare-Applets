package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.tag;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * <pre>
 *  用户标签对象
 *  Created by Acmedcare+ Developer on 2016/9/2.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxUserTag implements Serializable {
  private static final long serialVersionUID = -7722428695667031252L;

  /** 标签id，由微信分配. */
  private Long id;

  /** 标签名，UTF8编码. */
  private String name;

  /** 此标签下粉丝数. */
  private Integer count;

  public static WxUserTag fromJson(String json) {
    return WxMpGsonBuilder.create()
        .fromJson(new JsonParser().parse(json).getAsJsonObject().get("tag"), WxUserTag.class);
  }

  public static List<WxUserTag> listFromJson(String json) {
    return WxMpGsonBuilder.create()
        .fromJson(
            new JsonParser().parse(json).getAsJsonObject().get("tags"),
            new TypeToken<List<WxUserTag>>() {}.getType());
  }

  public String toJson() {
    return WxMpGsonBuilder.create().toJson(this);
  }

  @Override
  public String toString() {
    return this.toJson();
  }
}
