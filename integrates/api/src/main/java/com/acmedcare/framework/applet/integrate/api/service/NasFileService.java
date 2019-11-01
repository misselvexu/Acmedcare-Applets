package com.acmedcare.framework.applet.integrate.api.service;

import com.acmedcare.framework.applet.api.exception.FileException;
import com.acmedcare.framework.applet.integrate.api.bean.DownloadFileRequest;
import com.acmedcare.framework.applet.integrate.api.bean.DownloadFileResponse;
import com.acmedcare.framework.applet.integrate.api.bean.UploadFileRequest;
import com.acmedcare.framework.applet.integrate.api.bean.UploadFileResponse;
import com.acmedcare.framework.applet.integrate.api.spi.FileService;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;

import static com.acmedcare.framework.applet.integrate.api.service.NasFileService.EXTENSION_NAME;

/**
 * {@link NasFileService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Extension(EXTENSION_NAME)
public class NasFileService implements FileService {

  /** Extension Service Name */
  static final String EXTENSION_NAME = "nas";

  @Override
  public UploadFileResponse upload(UploadFileRequest request) throws FileException {
    return null;
  }

  @Override
  public DownloadFileResponse download(DownloadFileRequest request) throws FileException {
    return null;
  }
}
