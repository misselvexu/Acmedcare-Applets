package com.acmedcare.framework.applet.integrate.dingtalk.model;

import com.acmedcare.framework.applet.integrate.storage.api.model.AppletCommonModel;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * {@link DingTalkCallbackModel}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/28.
 */
public class DingTalkCallbackModel {

  public static final String NAMESPACE = "ding-talk-ns";

  @Getter
  @Setter
  @Builder
  @ToString
  @NoArgsConstructor
  public static class CallbackKey implements Serializable {

    private String appId;
    private String suiteId;
    private String suiteKey;

    // ==== equals && hashCode

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      CallbackKey that = (CallbackKey) o;
      return appId.equals(that.appId)
          && suiteId.equals(that.suiteId)
          && suiteKey.equals(that.suiteKey);
    }

    @Override
    public int hashCode() {
      return Objects.hash(appId, suiteId, suiteKey);
    }
  }

  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  public static class DingTalkCallbackModelKey
      extends AppletCommonModel.AppletCommonModelKey<CallbackKey> {

    @Builder
    public DingTalkCallbackModelKey(String namespace, CallbackKey key) {
      super(namespace, key);
    }

    @Override
    public boolean equals(Object o) {
      return super.equals(o);
    }

    @Override
    public int hashCode() {
      return super.hashCode();
    }
  }

  @Getter
  @Setter
  @NoArgsConstructor
  public static class DingTalkCallbackModelValue
      extends AppletCommonModel.AppletCommonModelValue<String> {

    @Builder
    public DingTalkCallbackModelValue(String suiteTicket) {
      super(suiteTicket);
    }
  }
}
