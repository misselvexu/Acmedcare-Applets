package com.acmedcare.framework.applet.integrate.dingtalk.service;

import com.acmedcare.framework.applet.integrate.dingtalk.DingTalkIntegrateProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * {@link DingTalkCallbackService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/27.
 */
@Component
public class DingTalkCallbackService {

  private static final Logger log = LoggerFactory.getLogger(DingTalkCallbackService.class);

  private final DingTalkIntegrateProperties properties;

  public DingTalkCallbackService(DingTalkIntegrateProperties properties) {
    this.properties = properties;
  }

  /**
   * 处理访问钉钉服务端的凭证
   *
   * <pre>
   * suite_ticket用于用签名形式生成accessToken(访问钉钉服务端的凭证)，需要保存到应用的db。
   * 钉钉会定期向本callback url推送suite_ticket新值用以提升安全性。
   * 应用在获取到新的时值时，保存db成功后，返回给钉钉success加密串（如本demo的return）
   * </pre>
   *
   * @param suiteTicket 服务端的凭证
   */
  public void processSuiteTicketEvent(@NonNull String suiteTicket) {

    

  }
}
