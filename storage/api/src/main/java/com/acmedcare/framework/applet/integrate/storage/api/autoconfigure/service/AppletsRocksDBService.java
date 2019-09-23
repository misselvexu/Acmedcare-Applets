package com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service;

import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.AppletsRepositoryProperties;
import com.acmedcare.framework.kits.lang.Nullable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.rocksdb.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRocksDBService.AppletsColumnFamilies.AUTH;

/**
 * {@link AppletsRocksDBService}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/23.
 */
public class AppletsRocksDBService {

  private static final Logger log = LoggerFactory.getLogger(AppletsRocksDBService.class);

  private final AppletsRepositoryProperties properties;

  private RocksDB rdb;

  /**
   * Applet Auth Column Family Defined
   *
   * <p>
   */
  private ColumnFamilyDescriptor appletAuthColumnFamily = new ColumnFamilyDescriptor(AUTH.columnFamilyName.getBytes(), AUTH.columnFamilyOptions);

  private final List<ColumnFamilyHandle> columnFamilyHandles = Lists.newArrayList();

  private final Map<AppletsColumnFamilies, ColumnFamilyHandle> columnFamilyHandleMap = Maps.newHashMap();

  @Nullable ColumnFamilyHandle familyHandle(AppletsColumnFamilies columnFamilies) {
    return columnFamilyHandleMap.get(columnFamilies);
  }

  public AppletsRocksDBService(AppletsRepositoryProperties properties) {
    this.properties = properties;
  }

  public enum AppletsColumnFamilies {

    /** */
    AUTH("applet_auth_column", new ColumnFamilyOptions());

    private String columnFamilyName;

    private ColumnFamilyOptions columnFamilyOptions;

    AppletsColumnFamilies(String columnFamilyName, ColumnFamilyOptions columnFamilyOptions) {
      this.columnFamilyName = columnFamilyName;
      this.columnFamilyOptions = columnFamilyOptions;
    }
  }

  void startup() {

    try {
      long start = System.currentTimeMillis();
      log.info("[==Applets RDB==] start initializing ...");

      DBOptions options = new DBOptions();
      options.setCreateIfMissing(true);

      rdb = OptimisticTransactionDB.open(options, this.properties.getRdbConfig().getStoragePath(), Lists.newArrayList(appletAuthColumnFamily), columnFamilyHandles);

      log.info("[==Applets RDB==] Rocks DB initialized , instance: {}" ,rdb);

      for (ColumnFamilyHandle columnFamilyHandle : columnFamilyHandles) {
        if(Arrays.equals(appletAuthColumnFamily.getName(), columnFamilyHandle.getName())) {
          columnFamilyHandleMap.put(AUTH,columnFamilyHandle);
        }
      }

      log.info("[==Applets RDB==] initialized , time: {} ms", (System.currentTimeMillis() - start));
    } catch (Exception e) {
      log.warn("[==Applets RDB==] initialize happen-ed exception", e);
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
