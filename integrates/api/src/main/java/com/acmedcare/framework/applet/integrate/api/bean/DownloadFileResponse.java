package com.acmedcare.framework.applet.integrate.api.bean;

import lombok.*;

import java.io.Serializable;

/**
 * {@link DownloadFileResponse}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Getter
@Setter
@Builder
@ToString(exclude = "file")
@NoArgsConstructor
@AllArgsConstructor
public class DownloadFileResponse implements Serializable {

  private static final String CONTENT_DISPOSITION_FILENAME = "attachment;fileName=%s";

  private String fileId;

  private byte[] file;

  private String mediaType;

  private String checksum;

  public String responseFileName() {
    return String.format(CONTENT_DISPOSITION_FILENAME, this.fileId);
  }
}
