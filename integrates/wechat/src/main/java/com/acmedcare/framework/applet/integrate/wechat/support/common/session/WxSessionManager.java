package com.acmedcare.framework.applet.integrate.wechat.support.common.session;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxSessionManager {

  /** 获取某个sessionId对应的session,如果sessionId没有对应的session，则新建一个并返回。 */
  WxSession getSession(String sessionId);

  /** 获取某个sessionId对应的session,如果sessionId没有对应的session，若create为true则新建一个，否则返回null。 */
  WxSession getSession(String sessionId, boolean create);
}
