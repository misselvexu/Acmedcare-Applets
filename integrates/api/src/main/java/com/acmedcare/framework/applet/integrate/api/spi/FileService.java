package com.acmedcare.framework.applet.integrate.api.spi;

import com.acmedcare.framework.applet.api.exception.FileException;
import com.acmedcare.framework.applet.integrate.common.annotation.FullExposureExtension;
import com.acmedcare.framework.applet.integrate.api.bean.DownloadFileRequest;
import com.acmedcare.framework.applet.integrate.api.bean.DownloadFileResponse;
import com.acmedcare.framework.applet.integrate.api.bean.UploadFileRequest;
import com.acmedcare.framework.applet.integrate.api.bean.UploadFileResponse;
import com.acmedcare.framework.applet.integrate.common.spi.Extensible;

/**
 * {@link FileService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Extensible
@FullExposureExtension
public interface FileService {

  String FILE_NAMESPACE = "applet-file-storage-ns";

  /**
   * Upload File
   *
   * @param request upload request
   * @return upload result instance of {@link UploadFileResponse}
   * @throws FileException maybe thrown {@link FileException}
   */
  UploadFileResponse upload(UploadFileRequest request) throws FileException;

  /**
   * Download file
   *
   * @param request download request
   * @return download result instance of {@link DownloadFileResponse}
   * @throws FileException maybe thrown {@link FileException}
   */
  DownloadFileResponse download(DownloadFileRequest request) throws FileException;
}
