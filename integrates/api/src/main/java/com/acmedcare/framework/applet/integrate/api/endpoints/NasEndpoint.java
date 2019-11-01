package com.acmedcare.framework.applet.integrate.api.endpoints;

import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import com.acmedcare.framework.applet.integrate.api.AppletsContext;
import com.acmedcare.framework.applet.integrate.api.AppletsIntegrateProperties;
import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.integrate.api.bean.UploadFileRequest;
import com.acmedcare.framework.applet.integrate.api.bean.UploadFileResponse;
import com.acmedcare.framework.applet.integrate.api.spi.FileService;
import com.acmedcare.framework.applet.integrate.common.kits.FileNameUtil;
import com.acmedcare.framework.kits.timed.TimedIdGenerator;
import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_ENDPOINT_PREFIX;
import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_NAS_ENDPOINT;

/**
 * {@link NasEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Path(APPLET_NAS_ENDPOINT)
public class NasEndpoint {

  private static final Logger log = LoggerFactory.getLogger(NasEndpoint.class);

  private static final String FILE_UPLOAD_ATTRIBUTE_NAME = "file";

  private static final TimedIdGenerator FILENAME_GENERATOR = new TimedIdGenerator();

  public static final String FILE_PUBLISH_URI_TEMPLATE =
      APPLET_ENDPOINT_PREFIX + APPLET_NAS_ENDPOINT + "/d/%s";

  /**
   * Resteasy determines the charset from the Content-Type associated with a part. If set correctly
   * everything is working out of the box. HTML Spec:
   * http://www.w3.org/TR/html401/interact/forms.html#h-17.13.4.2
   *
   * <pre>
   *   POST /file HTTP/1.1
   *   Content-Type: multipart/form-data; boundary=AaB03x
   *   --AaB03x
   *   Content-Disposition: form-data; name="file"; filename="file1.txt"
   *   Content-Type: text/plain; charset=utf-8
   *   ... contents of file1.txt ...
   *   --AaB03x--
   * </pre>
   *
   * <pre>
   *  curl -F file=@/Users/misselvexu/Downloads/iPhone-11-Pro-stock-blue-wallpaper-by-AR72014.png http://127.0.0.1:5543/applet-endpoints/applet/nas/upload
   * </pre>
   *
   * @param input upload form instance
   * @param headers upload headers
   * @return {@link AppletResponse}
   */
  @POST
  @Path("/upload")
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  @Produces(MediaType.APPLICATION_JSON)
  public AppletResponse create(MultipartFormDataInput input, @Context HttpHeaders headers) {

    try {

      Map<String, List<InputPart>> uploadForm = input.getFormDataMap();

      log.info("[==Applets File==] upload form map(s) size : {}", uploadForm.size());

      List<InputPart> inputParts = uploadForm.get(FILE_UPLOAD_ATTRIBUTE_NAME);

      log.info("[==Applets File==] upload input part(s) size : {}", inputParts.size());

      AppletsIntegrateProperties properties = AppletsContext.context().getProperties();

      FileService fileService =
          AppletsSPIExtensionFactory.getService(
              properties.getFileStorageConfig().getType().name().toLowerCase(), FileService.class);

      //
      InputPart inputPart = inputParts.get(0);

      MultivaluedMap<String, String> header = inputPart.getHeaders();

      InputStream inputStream = inputPart.getBody(InputStream.class, null);

      MediaType mediaType = inputPart.getMediaType();

      log.info("[==Applets File==] upload input part media type is : {}", mediaType);

      byte[] bytes = IOUtils.toByteArray(inputStream);

      log.info("[==Applets File==] upload input part file size : {} b(yte)", bytes.length);

      String fileName = FileNameUtil.newFileName();

      log.info("[==Applets File==] generate file name is : {} ", fileName);

      // build upload request
      UploadFileRequest uploadFileRequest =
          UploadFileRequest.builder().mediaType(mediaType).fileKey(fileName).file(bytes).build();

      UploadFileResponse response = fileService.upload(uploadFileRequest);

      log.info("[==Applets File==] upload result is : {} ", response);

      return AppletResponse.appletResponseBuilder()
          .status(AppletResponse.Status.SUCCESS)
          .data(response)
          .appletResponseBuild();

    } catch (Exception e) {
      return AppletResponse.appletResponseBuilder()
          .status(AppletResponse.Status.EXCEPTION)
          .message(e.getMessage())
          .appletResponseBuild();
    }
  }

  @GET
  @Path("/d/{fileId}")
  public Response download(@PathParam("fileId") String fileId) {

    return null;
  }
}
