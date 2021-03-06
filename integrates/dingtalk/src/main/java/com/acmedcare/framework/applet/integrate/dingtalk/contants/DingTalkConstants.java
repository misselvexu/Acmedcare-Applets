package com.acmedcare.framework.applet.integrate.dingtalk.contants;

/**
 * {@link DingTalkConstants}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
public final class DingTalkConstants {

  /** 获取可访问企业相关信息的accessToken的URL */
  public static final String URL_GET_CORP_TOKEN = "https://oapi.dingtalk.com/service/get_corp_token";

  /** 获取用户在企业内userId的接口URL */
  public static final String URL_GET_USER_INFO = "https://oapi.dingtalk.com/user/getuserinfo";

  /** 获取用户详情 */
  public static final String URL_GET_USER = "https://oapi.dingtalk.com/user/get";
}
