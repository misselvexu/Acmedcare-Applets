package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service;

import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryProperties;
import com.acmedcare.framework.kits.Assert;
import com.acmedcare.framework.kits.StringUtils;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * {@link AppletsRDBService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
public class AppletsRDBService {

  private static final Logger log = LoggerFactory.getLogger(AppletsRDBService.class);

  private final AppletsRepositoryProperties properties;

  private static final String DEFAULT_DB_FILE_NAME = "applet_rdb.db";

  private static final String FILE_SEPAR = "/";

  private AtomicBoolean initialized = new AtomicBoolean(false);

  /**
   * R-DB instance
   *
   * @see DB
   */
  private DB rdb;

  /**
   * Return {@link DB} instance
   *
   * @return db instance
   */
  public DB db() {
    return rdb;
  }

  public AppletsRDBService(AppletsRepositoryProperties properties) {
    this.properties = properties;
  }

  public enum AppletsDBNames {

    /** */
    AUTH("applet_auth_db");

    private String name;

    AppletsDBNames(String name) {
      this.name = name;
    }
  }

  void startup() {

    if (initialized.compareAndSet(false, true)) {
      try {
        long start = System.currentTimeMillis();
        log.info("[==Applets RDB==] start initializing ...");

        String path = properties.getRdbConfig().getStoragePath();

        if (StringUtils.isNotBlank(path)) {
          File file = new File(path);
          if (!file.exists()) {
            log.info("[==Applets RDB==] create db-directory : {}", file.mkdirs());
          }

          Assert.isTrue(file.isDirectory());
        }

        if (path.endsWith(FILE_SEPAR)) {
          path = path.concat(DEFAULT_DB_FILE_NAME);
        } else {
          path = path.concat(File.separator).concat(DEFAULT_DB_FILE_NAME);
        }

        DBMaker.Maker maker = DBMaker.fileDB(path).fileChannelEnable().transactionEnable();

        rdb = maker.make();

        log.info("[==Applets RDB==] DB initialized , instance: {}", rdb);

        log.info(
            "[==Applets RDB==] initialized , time: {} ms", (System.currentTimeMillis() - start));
      } catch (Exception e) {
        log.warn("[==Applets RDB==] initialize happen-ed exception", e);
      }
    }
  }

  void shutdown() {
    log.info("[==Applets RDB==] start shutdown ~~~");
    try {
      rdb.close();
    } catch (Exception e) {
      log.warn("[==Applets RDB==] shutdown happen-ed exception", e);
    }
  }
}
