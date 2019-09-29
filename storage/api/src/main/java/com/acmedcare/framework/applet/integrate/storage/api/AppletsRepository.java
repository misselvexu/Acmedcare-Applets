package com.acmedcare.framework.applet.integrate.storage.api;

import com.acmedcare.framework.applet.api.exception.RepositoryException;
import com.acmedcare.framework.applet.integrate.common.spi.Extensible;
import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryContext;
import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRDBService;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link AppletsRepository}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/20.
 */
@Extensible
public abstract class AppletsRepository {

  /** Logger Instance */
  private static final Logger log = LoggerFactory.getLogger(AppletsRepository.class);

  /**
   * Save Principal
   *
   * @param key auth info biz key
   * @param value value
   */
  public void savePrincipal(
      AppletAuthModel.AppletAuthModelKey key, AppletAuthModel.AppletAuthModelValue value) {

    try {

      AppletsRDBService rdbService =
          AppletsRepositoryContext.context().getBean(AppletsRDBService.class);

      AppletAuthModel.AppletAuthModelValue origin = rdbService.authStorage().put(key, value);

      log.info("[==DingTalk Repository==] save principa :{}", origin);

    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }
}
