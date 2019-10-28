package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.datacube;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * <pre>
 * 累计用户数据接口的返回JSON数据包
 * 详情查看文档：<a href="http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141082&token=&lang=zh_CN">用户分析数据接口</a>
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxDataCubeUserCumulate implements Serializable {
  private static final JsonParser JSON_PARSER = new JsonParser();

  private static final long serialVersionUID = -3570981300225093657L;

  private Date refDate;

  private Integer cumulateUser;

  public static List<WxDataCubeUserCumulate> fromJson(String json) {
    return WxMpGsonBuilder.create()
        .fromJson(
            JSON_PARSER.parse(json).getAsJsonObject().get("list"),
            new TypeToken<List<WxDataCubeUserCumulate>>() {}.getType());
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}