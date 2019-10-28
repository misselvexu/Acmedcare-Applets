package com.acmedcare.framework.applet.integrate.wechat.support.mp.api;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;

/**
 * 评论数据管理.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2019-06-16
 */
public interface WxMpCommentService {
  /**
   * 打开已群发文章评论. https://api.weixin.qq.com/cgi-bin/comment/open?access_token=ACCESS_TOKEN 参数 是否必须 类型
   * 说明
   *
   * @param msgDataId 群发返回的msg_data_id
   * @param index 多图文时，用来指定第几篇图文，从0开始，不带默认操作该msg_data_id的第一篇图文
   * @throws WxErrorException 异常
   */
  void open(Integer msgDataId, Integer index) throws WxErrorException;
}
