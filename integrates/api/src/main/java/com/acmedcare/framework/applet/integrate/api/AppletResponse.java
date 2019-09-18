package com.acmedcare.framework.applet.integrate.api;

import com.acmedcare.framework.kits.jackson.JacksonDateFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 * {@link AppletResponse}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/18.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(NON_NULL)
public class AppletResponse<T, M> implements Serializable {

  @JacksonDateFormat private Date timestamp = new Date();

  private Status status = Status.SUCCESS;

  private T data;

  private M message;

  @Builder(buildMethodName = "appletResponseBuild", builderMethodName = "appletResponseBuilder")
  public AppletResponse(Status status, Date timestamp, M message, T data) {
    this.timestamp = timestamp;
    if (timestamp == null) {
      this.timestamp = new Date();
    }
    this.message = message;
    this.data = data;
    this.status = status;
    if (this.status == null) {
      this.status = Status.SUCCESS;
    }
  }

  /**
   * Entity Body Status
   *
   * <p>
   */
  public enum Status {
    /** Success Flag */
    SUCCESS,

    FAILED,

    EXCEPTION
  }
}
