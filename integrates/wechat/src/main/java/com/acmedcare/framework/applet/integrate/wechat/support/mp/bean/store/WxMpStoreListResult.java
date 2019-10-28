package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.store;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * <pre>
 * 门店列表结果类
 * Created by Binary Wang on 2016-09-27.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpStoreListResult implements Serializable {
  private static final long serialVersionUID = 5388907559949538663L;

  /** 错误码，0为正常. */
  @SerializedName("errcode")
  private Integer errCode;
  /** 错误信息. */
  @SerializedName("errmsg")
  private String errMsg;
  /** 门店信息列表. */
  @SerializedName("business_list")
  private List<WxMpStoreInfo> businessList;
  /** 门店信息总数. */
  @SerializedName("total_count")
  private Integer totalCount;

  public static WxMpStoreListResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxMpStoreListResult.class);
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
