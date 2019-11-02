package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service;

import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryProperties;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletCommonModel;
import com.acmedcare.framework.kits.Assert;
import com.acmedcare.framework.kits.StringUtils;
import lombok.Getter;
import org.mapdb.BTreeMap;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.serializer.SerializerByteArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRDBService.AppletsDBNames.AUTH;
import static com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRDBService.AppletsDBNames.COMMON;

/**
 * {@link AppletsRDBService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
public class AppletsRDBService {

  // PROPERTIES

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

  /**
   * Auth Storage Map
   */
  private BTreeMap<AppletAuthModel.AppletAuthModelKey, byte[]> authMap;

  /**
   * Common Storage Map
   */
  private BTreeMap<AppletCommonModel.AppletCommonModelKey, byte[]> commonMap;

  public BTreeMap<AppletAuthModel.AppletAuthModelKey, byte[]>
      authStorage() {
    return authMap;
  }

  public BTreeMap<AppletCommonModel.AppletCommonModelKey, byte[]>
      commonStorage() {
    return commonMap;
  }

  // CONSTRUCTORS
  public AppletsRDBService(AppletsRepositoryProperties properties) {
    this.properties = properties;
  }

  // INNER CLASSES
  public enum AppletsDBNames {

    /** Auth Storage */
    AUTH("applet_auth_db"),

    /** Common Stroage */
    COMMON("common_db");

    @Getter private String name;

    AppletsDBNames(String name) {
      this.name = name;
    }
  }

  // START UP
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
        } else {
          throw new IllegalArgumentException("invalid argunment - path");
        }

        if (path.endsWith(FILE_SEPAR)) {
          path = path.concat(DEFAULT_DB_FILE_NAME);
        } else {
          path = path.concat(File.separator).concat(DEFAULT_DB_FILE_NAME);
        }

        // INIT
        DBMaker.Maker maker = DBMaker.fileDB(path).fileChannelEnable().fileMmapEnableIfSupported().checksumHeaderBypass();

        rdb = maker.make();

        log.info("[==Applets RDB==] DB initialized , instance: {}", rdb);

        // BUILD DB-MAPS
        authMap = db().treeMap(AUTH.getName())
            .keySerializer(new AppletAuthModel.AppletAuthModelKeySerializer())
            .valueSerializer(SerializerByteArray.BYTE_ARRAY)
            .createOrOpen();
        log.info("[==Applets RDB==] DB-Map :{} is createOrOpen-ed, {}", AUTH, authMap);

        commonMap = db().treeMap(COMMON.getName())
            .keySerializer(new AppletCommonModel.AppletCommonModelKeySerializer())
            .valueSerializer(SerializerByteArray.BYTE_ARRAY)
            .createOrOpen();

        log.info("[==Applets RDB==] DB-Map :{} is createOrOpen-ed, {}", COMMON, commonMap);

        // END
        log.info(
            "[==Applets RDB==] initialized , time: {} ms", (System.currentTimeMillis() - start));
      } catch (Exception e) {
        log.warn("[==Applets RDB==] initialize happen-ed exception", e);
      }
    }
  }

  // SHUTDOWN
  void shutdown() {
    log.info("[==Applets RDB==] start shutdown ~~~");
    try {
      rdb.close();
    } catch (Exception e) {
      log.warn("[==Applets RDB==] shutdown happen-ed exception", e);
    }
  }
}
