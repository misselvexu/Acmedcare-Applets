package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.datacube;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * <pre>
 *  统计接口的共用属性类.
 *  Created by Acmedcare+ Developer on 2016/8/25.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public abstract class WxDataCubeBaseResult implements Serializable {
  protected static final JsonParser JSON_PARSER = new JsonParser();
  private static final long serialVersionUID = 8780389911053297600L;
  /** ref_date. 数据的日期，需在begin_date和end_date之间 */
  @SerializedName("ref_date")
  private String refDate;

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
