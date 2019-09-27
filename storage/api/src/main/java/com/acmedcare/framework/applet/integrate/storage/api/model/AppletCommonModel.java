package com.acmedcare.framework.applet.integrate.storage.api.model;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
  @NoArgsConstructor
  @Builder(builderMethodName = "CommonModelKeyBuilder", buildMethodName = "commonkeyBuild")
  public static class AppletCommonModelKey<K> implements Serializable {

    /** Storage Namespace Defined */
    protected String namespace;

    /** Biz Unique Key */
    protected K key;

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

  @Getter
  @Setter
  @NoArgsConstructor
  @Builder(builderMethodName = "CommonModelValueBuilder", buildMethodName = "commonValueBuild")
  public static class AppletCommonModelValue<V> implements Serializable {

    /** Common Model Value Object */
    protected V value;
  }

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

  public static class AppletCommonModelValueSerializer
      extends GroupSerializerObjectArray<AppletCommonModelValue> {

    @Override
    public void serialize(@NotNull DataOutput2 out, @NotNull AppletCommonModelValue value)
        throws IOException {
      out.writeUTF(COMMON_GSON.toJson(value));
    }

    @Override
    public AppletCommonModelValue deserialize(@NotNull DataInput2 input, int available)
        throws IOException {
      return COMMON_GSON.fromJson(input.readUTF(), AppletCommonModelValue.class);
    }
  }
}
