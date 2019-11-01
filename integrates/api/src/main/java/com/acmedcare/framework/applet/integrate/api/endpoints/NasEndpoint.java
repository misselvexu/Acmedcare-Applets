package com.acmedcare.framework.applet.integrate.api.endpoints;

import com.acmedcare.framework.applet.integrate.api.AppletResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_NAS_ENDPOINT;

/**
 * {@link NasEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/11/1.
 */
@Path(APPLET_NAS_ENDPOINT)
public class NasEndpoint {

  private static final String FILE_UPLOAD_ATTRIBUTE_NAME = "file";

  /**
   * Upload Request Method
   *
   * @param form upload form instance
   * @return {@link AppletResponse}
   */
  @POST
  @Path("/upload")
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  @Produces(MediaType.APPLICATION_JSON)
  public AppletResponse create(@MultipartForm FileUploadForm form) {
    // Do something with your filedata here



    return null;
  }


  @GET
  @Path("/download/{fileId}")
  public Response download(@PathParam("fileId") String fileId) {

    

    return null;
  }


  /**
   * File Upload Form Instance
   *
   * @since 2.2.0
   */
  @NoArgsConstructor
  public static class FileUploadForm {

    @Getter private byte[] file;

    @FormParam(FILE_UPLOAD_ATTRIBUTE_NAME)
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    public void setFileData(final byte[] file) {
      this.file = file;
    }
  }
}
