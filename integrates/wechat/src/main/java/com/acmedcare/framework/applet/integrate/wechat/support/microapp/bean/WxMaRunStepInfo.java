package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 微信运动步数信息.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMaRunStepInfo implements Serializable {
  private static final JsonParser JSON_PARSER = new JsonParser();
  private static final long serialVersionUID = -7496372171398607044L;

  /** 时间戳，表示数据对应的时间. */
  private Long timestamp;

  /** 微信运动步数. */
  private Integer step;

  public static List<WxMaRunStepInfo> fromJson(String json) {
    JsonObject jsonObject = JSON_PARSER.parse(json).getAsJsonObject();
    return WxMaGsonBuilder.create()
        .fromJson(
            jsonObject.get("stepInfoList").toString(),
            new TypeToken<List<WxMaRunStepInfo>>() {}.getType());
  }
}
