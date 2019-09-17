package com.acmedcare.framework.applet.integrate.dingtalk.common;

import java.io.Serializable;

/**
 * service层返回对象列表封装
 *
 * @param <T>
 */
public class DingTalkResult<T> implements Serializable {

  private boolean success = false;

  private String code;

  private String message;

  private T result;

  private DingTalkResult() {}

  public static <T> DingTalkResult<T> success(T result) {
    DingTalkResult<T> item = new DingTalkResult<>();
    item.success = true;
    item.result = result;
    item.code = "0";
    item.message = "success";
    return item;
  }

  public static <T> DingTalkResult<T> failure(String errorCode, String errorMessage) {
    DingTalkResult<T> item = new DingTalkResult<>();
    item.success = false;
    item.code = errorCode;
    item.message = errorMessage;
    return item;
  }

  public static <T> DingTalkResult<T> failure(String errorCode) {
    DingTalkResult<T> item = new DingTalkResult<>();
    item.success = false;
    item.code = errorCode;
    item.message = "failure";
    return item;
  }

  public boolean hasResult() {
    return result != null;
  }

  public boolean isSuccess() {
    return success;
  }

  public T getResult() {
    return result;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
