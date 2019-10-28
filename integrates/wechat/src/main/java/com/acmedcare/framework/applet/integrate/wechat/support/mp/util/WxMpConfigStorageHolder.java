package com.acmedcare.framework.applet.integrate.wechat.support.mp.util;

/** @Author: yd @Date: 2019-03-20 22:06 */
public class WxMpConfigStorageHolder {

  private static final ThreadLocal<String> WX_MP_CONFIG_STORAGE_CHOSE =
      new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
          return "default";
        }
      };

  public static String get() {
    return WX_MP_CONFIG_STORAGE_CHOSE.get();
  }

  public static void set(String label) {
    WX_MP_CONFIG_STORAGE_CHOSE.set(label);
  }
}
