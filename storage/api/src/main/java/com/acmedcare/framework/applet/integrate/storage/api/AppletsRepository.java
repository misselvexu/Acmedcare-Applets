package com.acmedcare.framework.applet.integrate.storage.api;

import com.acmedcare.framework.applet.integrate.common.spi.Extensible;
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


  public void saveAccountMappings() {}


  public void saveAppletCallbacks(){}

}
