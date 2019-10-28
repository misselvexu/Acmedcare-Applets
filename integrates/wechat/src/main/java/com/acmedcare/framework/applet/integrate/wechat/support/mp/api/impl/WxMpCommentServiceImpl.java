package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpCommentService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2019-06-16
 */
@RequiredArgsConstructor
public class WxMpCommentServiceImpl implements WxMpCommentService {
  private final WxMpService wxMpService;

  @Override
  public void open(Integer msgDataId, Integer index) throws WxErrorException {
    JsonObject json = new JsonObject();
    json.addProperty("msg_data_id", msgDataId);
    if (index != null) {
      json.addProperty("index", index);
    }
    this.wxMpService.post(WxMpApiUrl.Comment.OPEN, json.toString());
  }
}
