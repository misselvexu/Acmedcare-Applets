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
 * {@link AppletAuthModel}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/27.
 */
public class AppletAuthModel {

  /** {@link Gson} Process Instance */
  private static final Gson AUTH_GSON = new Gson();

  @Getter
  @Setter
  @Builder
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AppletAuthModelKey implements Serializable, Comparable<AppletAuthModelKey> {

    private String thirdPlatformType;

    private String thirdPlatformId;

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      AppletAuthModelKey that = (AppletAuthModelKey) o;
      return Objects.equals(thirdPlatformType, that.thirdPlatformType)
          && Objects.equals(thirdPlatformId, that.thirdPlatformId);
    }

    @Override
    public int hashCode() {
      return Objects.hash(thirdPlatformType, thirdPlatformId);
    }

    @Override
    public int compareTo(@NotNull AppletAuthModelKey o) {
      return this.thirdPlatformId.compareTo(o.getThirdPlatformId());
    }
  }

  // ===== Serializer(s) =====

  public static class AppletAuthModelKeySerializer
      extends GroupSerializerObjectArray<AppletAuthModelKey> {

    @Override
    public void serialize(@NotNull DataOutput2 out, @NotNull AppletAuthModelKey value)
        throws IOException {
      out.writeUTF(AUTH_GSON.toJson(value));
    }

    @Override
    public AppletAuthModelKey deserialize(@NotNull DataInput2 input, int available)
        throws IOException {
      return AUTH_GSON.fromJson(input.readUTF(), AppletAuthModelKey.class);
    }
  }
}
