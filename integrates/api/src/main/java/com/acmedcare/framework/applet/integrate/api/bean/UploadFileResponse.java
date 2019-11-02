package com.acmedcare.framework.applet.integrate.api.bean;

import lombok.*;

import java.io.Serializable;

/**
 * {@link UploadFileResponse}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UploadFileResponse implements Serializable {

  private String fileKey;

  private long fileSize;

  private String mediaType;

  private String filePublishUrl;

  private String fileChecksum;

}
