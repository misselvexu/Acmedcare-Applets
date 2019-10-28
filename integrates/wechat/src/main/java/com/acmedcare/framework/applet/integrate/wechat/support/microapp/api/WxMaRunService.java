package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaRunStepInfo;

import java.util.List;

/**
 * 微信运动相关操作接口.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxMaRunService {

  /**
   * 解密分享敏感数据.
   * 文档地址：https://developers.weixin.qq.com/miniprogram/dev/api/open-api/werun/wx.getWeRunData.html
   *
   * @param sessionKey 会话密钥
   * @param encryptedData 消息密文
   * @param ivStr 加密算法的初始向量
   */
  List<WxMaRunStepInfo> getRunStepInfo(String sessionKey, String encryptedData, String ivStr);
}
