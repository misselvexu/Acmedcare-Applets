package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * 图文列表.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class TextImageList implements Serializable {

  /** 图片链接,必须调用 上传图片接口 上传图片获得链接，并在此填入， 否则报错 */
  @SerializedName("image_url")
  private String imageUrl;

  /** 图文描述. */
  @SerializedName("text")
  private String text;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
