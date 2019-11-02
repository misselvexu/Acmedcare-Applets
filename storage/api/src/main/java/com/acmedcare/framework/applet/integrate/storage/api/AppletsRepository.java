package com.acmedcare.framework.applet.integrate.storage.api;

import com.acmedcare.framework.applet.api.bean.Principal;
import com.acmedcare.framework.applet.api.exception.RepositoryException;
import com.acmedcare.framework.applet.integrate.common.annotation.FullExposureExtension;
import com.acmedcare.framework.applet.integrate.common.spi.Extensible;
import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryContext;
import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRDBService;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletCommonModel;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * {@link AppletsRepository}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/20.
 */
@Extensible
@FullExposureExtension
public abstract class AppletsRepository {

  /** Logger Instance */
  private static final Logger log = LoggerFactory.getLogger(AppletsRepository.class);

  /**
   * Save Principal
   *
   * @param key auth info biz key
   * @param principal principal
   */
  public void savePrincipal(AppletAuthModel.AppletAuthModelKey key, Principal principal) {

    try {

      AppletsRDBService rdbService =
          AppletsRepositoryContext.context().getBean(AppletsRDBService.class);

      byte[] bytes = rdbService.authStorage().put(key, JSON.toJSONBytes(principal));

      log.info("[==Default Repository==] save principa :{}", Arrays.toString(bytes));

    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public <T extends Principal> T queryPrincipal(
      AppletAuthModel.AppletAuthModelKey key, Class<T> clazz) {

    try {

      AppletsRDBService rdbService =
          AppletsRepositoryContext.context().getBean(AppletsRDBService.class);

      byte[] bytes = rdbService.authStorage().get(key);

      if (bytes == null || bytes.length == 0) {
        throw new RepositoryException("Principal is not found by key: " + key);
      }

      log.info("[==Default Repository==] query principa :{}", Arrays.toString(bytes));

      return JSON.parseObject(bytes, clazz);

    } catch (RepositoryException e) {
      throw e;
    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public void saveFile(AppletCommonModel.AppletCommonModelKey<String> key, Object fileBean) {

    AppletsRDBService rdbService =
        AppletsRepositoryContext.context().getBean(AppletsRDBService.class);

    byte[] bytes = rdbService.commonStorage().put(key, JSON.toJSONBytes(fileBean));

    log.info("[==Default Repository==] saved file bean :{}", Arrays.toString(bytes));
  }

  public <T> T queryFile(AppletCommonModel.AppletCommonModelKey<String> key, Class<T> clazz) {

    AppletsRDBService rdbService =
        AppletsRepositoryContext.context().getBean(AppletsRDBService.class);

    byte[] bytes = rdbService.commonStorage().get(key);

    if (bytes == null || bytes.length == 0) {
      throw new RepositoryException("File is not found by key: " + key);
    }

    log.info("[==Default Repository==] query file bean :{}", Arrays.toString(bytes));

    return JSON.parseObject(bytes, clazz);
  }



}
