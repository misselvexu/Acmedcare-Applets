package com.acmedcare.framework.applet.integrate.wechat.support.common.session;

import java.util.Enumeration;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public interface WxSession {

  Object getAttribute(String name);

  Enumeration<String> getAttributeNames();

  void setAttribute(String name, Object value);

  void removeAttribute(String name);

  void invalidate();
}
