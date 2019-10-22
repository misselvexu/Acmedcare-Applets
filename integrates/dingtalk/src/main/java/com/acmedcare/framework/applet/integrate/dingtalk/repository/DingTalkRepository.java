package com.acmedcare.framework.applet.integrate.dingtalk.repository;

import com.acmedcare.framework.applet.api.exception.RepositoryException;
import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import com.acmedcare.framework.applet.integrate.dingtalk.DingTalkAppletContext;
import com.acmedcare.framework.applet.integrate.dingtalk.model.DingTalkCallbackModel;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import com.acmedcare.framework.applet.integrate.storage.api.autoconfigure.service.AppletsRDBService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

import static com.acmedcare.framework.applet.integrate.dingtalk.DingTalkExtensionDefined.DING_TALK;
import static com.acmedcare.framework.applet.integrate.dingtalk.model.DingTalkCallbackModel.NAMESPACE;
import static com.acmedcare.framework.applet.integrate.storage.api.model.AppletCommonModel.DEFAULT_EMPTY_RESULT;

/**
 * {@link DingTalkRepository}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/27.
 */
@Extension(DING_TALK)
public class DingTalkRepository extends AppletsRepository {

  private static final Logger log = LoggerFactory.getLogger(DingTalkRepository.class);

  /**
   * Save DingTalk Server Callback Data: suiteTicket
   *
   * @param appId ding talk application id
   * @param suiteId ding talk application suite id
   * @param suiteKey ding talk application suite key
   * @param suiteTicket ding talk callback suiteTicket
   * @throws RepositoryException maybe thrown {@link RepositoryException}
   */
  public void saveSuiteTicketEventData(
      String appId, String suiteId, String suiteKey, String suiteTicket)
      throws RepositoryException {

    try {
      AppletsRDBService rdbService =
          DingTalkAppletContext.context().getBean(AppletsRDBService.class);

      DingTalkCallbackModel.DingTalkCallbackModelKey key =
          DingTalkCallbackModel.DingTalkCallbackModelKey.builder()
              .namespace(NAMESPACE)
              .key(
                  DingTalkCallbackModel.CallbackKey.builder()
                      .appId(appId)
                      .suiteId(suiteId)
                      .suiteKey(suiteKey)
                      .build())
              .build();

      byte[] origin =
          rdbService.commonStorage().put(key, suiteTicket.getBytes(Charset.defaultCharset()));

      log.info("[==DingTalk Repository==] save response :{}", origin);

    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }

  public String querySuiteTicket(String appId, String suiteId, String suiteKey) {

    try {
      AppletsRDBService rdbService =
          DingTalkAppletContext.context().getBean(AppletsRDBService.class);

      DingTalkCallbackModel.DingTalkCallbackModelKey key =
          DingTalkCallbackModel.DingTalkCallbackModelKey.builder()
              .namespace(NAMESPACE)
              .key(
                  DingTalkCallbackModel.CallbackKey.builder()
                      .appId(appId)
                      .suiteId(suiteId)
                      .suiteKey(suiteKey)
                      .build())
              .build();

      byte[] origin = rdbService.commonStorage().get(key);

      log.info("[==DingTalk Repository==] query suite ticket result : {}", origin);

      return origin == null ? DEFAULT_EMPTY_RESULT : new String(origin, Charset.defaultCharset());

    } catch (Exception e) {
      throw new RepositoryException(e);
    }
  }
}
