package com.acmedcare.framework.applet.integrate.storage.api.model;

import com.google.gson.Gson;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.mapdb.DataInput2;
import org.mapdb.DataOutput2;
import org.mapdb.serializer.GroupSerializerObjectArray;

import java.io.IOException;
import java.io.Serializable;

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
  }

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AppletAuthModelValue implements Serializable {

    // TODO

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
