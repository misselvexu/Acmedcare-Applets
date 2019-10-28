package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 设置小程序名称结果类
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @since 2019/1/26 17:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WxFastMaSetNickameResult extends WxOpenResult {
  private static final long serialVersionUID = 8022192589710319473L;

  /** 审核编号. */
  @SerializedName("audit_id")
  Long auditId;

  /** 材料说明 */
  @SerializedName("wording")
  String wording;
}
