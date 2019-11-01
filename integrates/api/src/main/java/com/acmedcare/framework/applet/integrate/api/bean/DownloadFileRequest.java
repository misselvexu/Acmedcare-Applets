package com.acmedcare.framework.applet.integrate.api.bean;

import lombok.*;

import java.io.Serializable;

/**
 * {@link DownloadFileRequest}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DownloadFileRequest implements Serializable {

  /** File Unique Id */
  private String fileId;

}
