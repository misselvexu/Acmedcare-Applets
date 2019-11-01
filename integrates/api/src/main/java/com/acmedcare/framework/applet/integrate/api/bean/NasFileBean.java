package com.acmedcare.framework.applet.integrate.api.bean;

import com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * {@link NasFileBean}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NasFileBean implements Serializable {

  private String fileKey;

  private Date uploadTime;

  private String checksum;

  private AppletsIntegrateProperties.FileStorageType storageType;

  private long fileSize;

  private String filePublishUrl;

  private String mediaType;
}
