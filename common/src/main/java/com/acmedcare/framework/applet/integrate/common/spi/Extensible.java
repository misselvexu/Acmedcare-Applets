package com.acmedcare.framework.applet.integrate.common.spi;

import java.lang.annotation.*;

/**
 * 代表这个类或者接口是可扩展的，默认单例、不需要编码
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @see Extension
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Extensible {

  /**
   * 指定自定义扩展文件名称，默认就是全类名
   *
   * @return 自定义扩展文件名称
   */
  String file() default "";

  /**
   * 扩展类是否使用单例，默认使用
   *
   * @return 是否使用单例
   */
  boolean singleton() default true;
}
