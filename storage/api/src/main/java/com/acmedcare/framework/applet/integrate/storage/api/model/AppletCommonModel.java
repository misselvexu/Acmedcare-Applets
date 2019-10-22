package com.acmedcare.framework.applet.integrate.storage.api.model;

import com.google.gson.Gson;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.mapdb.DataInput2;
import org.mapdb.DataOutput2;
import org.mapdb.serializer.GroupSerializerObjectArray;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

/**
 * {@link AppletCommonModel}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/27.
 */
public class AppletCommonModel {

  /** {@link Gson} Process Instance */
  private static final Gson COMMON_GSON = new Gson();

  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @Builder(builderMethodName = "CommonModelKeyBuilder", buildMethodName = "commonkeyBuild")
  public static class AppletCommonModelKey<K> implements Serializable {

    /** Storage Namespace Defined */
    protected String namespace;

    /** Biz Unique Key */
    protected K key;

    public AppletCommonModelKey(String namespace, K key) {
      this.namespace = namespace;
      this.key = key;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      AppletCommonModelKey<?> that = (AppletCommonModelKey<?>) o;
      return namespace.equals(that.namespace) && key.equals(that.key);
    }

    @Override
    public int hashCode() {
      return Objects.hash(namespace, key);
    }

  }

  public static final String DEFAULT_EMPTY_RESULT = "temp_suite_ticket_only4_test";

  // ===== Serializer(s) =====

  public static class AppletCommonModelKeySerializer
      extends GroupSerializerObjectArray<AppletCommonModelKey> {

    @Override
    public void serialize(@NotNull DataOutput2 out, @NotNull AppletCommonModelKey value)
        throws IOException {
      out.writeUTF(COMMON_GSON.toJson(value));
    }

    @Override
    public AppletCommonModelKey deserialize(@NotNull DataInput2 input, int available)
        throws IOException {
      return COMMON_GSON.fromJson(input.readUTF(), AppletCommonModelKey.class);
    }
  }
}
