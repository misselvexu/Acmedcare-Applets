package com.acmedcare.framework.applet.integrate.spi;

import java.lang.annotation.*;

/**
 * 扩展点
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @see Extensible
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Extension {
  /**
   * 扩展点名字
   *
   * @return 扩展点名字
   */
  String value();

  /**
   * 优先级排序，默认不需要，大的优先级高
   *
   * @return 排序
   */
  int order() default 0;
}
