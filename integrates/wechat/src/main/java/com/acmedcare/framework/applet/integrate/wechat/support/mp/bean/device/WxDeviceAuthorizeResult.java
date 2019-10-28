package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.device;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}.
 * @date 10/12/2016
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WxDeviceAuthorizeResult extends AbstractDeviceBean {
  private static final long serialVersionUID = 9105294570912249811L;

  private List<BaseResp> resp;

  public static WxDeviceAuthorizeResult fromJson(String response) {
    return WxGsonBuilder.create().fromJson(response, WxDeviceAuthorizeResult.class);
  }
}
