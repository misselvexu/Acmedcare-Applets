package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.message;

import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.ma.WxOpenMaSubmitAudit;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 微信小程序代码包提交审核(仅供第三方开发者代小程序调用)
 *
 * @author yqx
 * @date 2018/9/13
 */
@Data
public class WxOpenMaSubmitAuditMessage implements Serializable {

  @SerializedName("item_list")
  private List<WxOpenMaSubmitAudit> itemList;
}
