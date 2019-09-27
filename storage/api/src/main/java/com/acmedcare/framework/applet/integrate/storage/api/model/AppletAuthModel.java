package com.acmedcare.framework.applet.integrate.storage.api.model;

import com.acmedcare.framework.applet.api.bean.Principal;
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
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AppletAuthModelKey implements Serializable {

    private String originAuthId;

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
      return Objects.equals(originAuthId, that.originAuthId)
          && Objects.equals(thirdPlatformId, that.thirdPlatformId);
    }

    @Override
    public int hashCode() {
      return Objects.hash(originAuthId, thirdPlatformId);
    }
  }

  @Getter
  @Setter
  @NoArgsConstructor
  public static class AppletAuthModelValue
      extends AppletCommonModel.AppletCommonModelValue<Principal> implements Serializable {

    // TODO

    @Builder
    public AppletAuthModelValue(Principal value) {
      super(value);
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

  public static class AppletAuthModelValueSerializer
      extends GroupSerializerObjectArray<AppletAuthModelValue> {

    @Override
    public void serialize(@NotNull DataOutput2 out, @NotNull AppletAuthModelValue value)
        throws IOException {
      out.writeUTF(AUTH_GSON.toJson(value));
    }

    @Override
    public AppletAuthModelValue deserialize(@NotNull DataInput2 input, int available)
        throws IOException {
      return AUTH_GSON.fromJson(input.readUTF(), AppletAuthModelValue.class);
    }
  }
}
