package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean;

import lombok.Data;

/**
 *
 *
 * <pre>
 * 参考文档 https://developers.weixin.qq.com/miniprogram/dev/api-backend/templateMessage.send.html
 * Created by Acmedcare+ Developer on 2018/9/23.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMaTemplateData {
  private String name;
  private String value;
  private String color;

  public WxMaTemplateData() {}

  public WxMaTemplateData(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public WxMaTemplateData(String name, String value, String color) {
    this.name = name;
    this.value = value;
    this.color = color;
  }
}
