package com.acmedcare.framework.applet.integrate.dingtalk.endpoint;

import com.acmedcare.framework.applet.integrate.api.annotation.ExtensionEndpoint;
import com.acmedcare.framework.applet.integrate.dingtalk.DingTalkAppletContext;
import com.acmedcare.framework.applet.integrate.dingtalk.DingTalkIntegrateProperties;
import com.acmedcare.framework.applet.integrate.dingtalk.service.DingTalkCallbackService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dingtalk.oapi.lib.aes.DingTalkEncryptException;
import com.dingtalk.oapi.lib.aes.DingTalkEncryptor;
import com.dingtalk.oapi.lib.aes.Utils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import static com.acmedcare.framework.applet.integrate.dingtalk.endpoint.DingTalkCallbackEndpoint.DINGTALK_CALLBACK;

/**
 * {@link DingTalkCallbackEndpoint}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/19.
 */
@ExtensionEndpoint
@Path(DINGTALK_CALLBACK)
public class DingTalkCallbackEndpoint {

  public static final String DINGTALK_CALLBACK = "/callback/dingtalk";

  private static final Logger log = LoggerFactory.getLogger(DingTalkCallbackEndpoint.class);

  /** 创建套件后，验证回调URL创建有效事件（第一次保存回调URL之前） */
  private static final String EVENT_CHECK_CREATE_SUITE_URL = "check_create_suite_url";
  /** 创建套件后，验证回调URL变更有效事件（第一次保存回调URL之后） */
  private static final String EVENT_CHECK_UPADTE_SUITE_URL = "check_update_suite_url";

  /** suite_ticket推送事件 */
  private static final String EVENT_SUITE_TICKET = "suite_ticket";
  /** 企业授权开通应用事件 */
  private static final String EVENT_TMP_AUTH_CODE = "tmp_auth_code";
  /** 相应钉钉回调时的值 */
  private static final String CALLBACK_RESPONSE_SUCCESS = "success";

  @POST
  @Produces({MediaType.APPLICATION_JSON})
  public Response callback(@Context HttpServletRequest request) {

    String signature = request.getParameter("signature");
    String timestamp = request.getParameter("timestamp");
    String nonce = request.getParameter("nonce");

    log.info("[==DingTalk==] Callback queryString params: {} - {} - {}" ,signature, timestamp, nonce);

    try {
      CallbackPayload payload =
          JSON.parseObject(IOUtils.toByteArray(request.getInputStream()), CallbackPayload.class);

      log.info("[==DingTalk==] Callback payload: {}" , JSON.toJSONString(payload));

      DingTalkIntegrateProperties properties = DingTalkAppletContext.context().getProperties();

      DingTalkEncryptor dingTalkEncryptor =
          new DingTalkEncryptor(
              properties.getCallbackUrlSignToken(),
              properties.getCallbackUrlAesKey(),
              properties.getSuiteKey());

      String plainText =
          dingTalkEncryptor.getDecryptMsg(signature, timestamp, nonce, payload.getEncrypt());

      log.info("[==DingTalk==] Callback decode content: {}" , plainText);

      JSONObject obj = JSON.parseObject(plainText);

      // 根据回调数据类型做不同的业务处理
      String eventType = obj.getString("EventType");

      log.info("[==DingTalk==] Callback decode event: {}" , eventType);

      switch (eventType) {
        case EVENT_CHECK_CREATE_SUITE_URL:
          log.info("验证新创建的回调URL有效性: " + plainText);
          break;

        case EVENT_CHECK_UPADTE_SUITE_URL:
          log.info("验证更新回调URL有效性: " + plainText);
          break;

        case EVENT_SUITE_TICKET:
          // suite_ticket用于用签名形式生成accessToken(访问钉钉服务端的凭证)，需要保存到应用的db。
          // 钉钉会定期向本callback url推送suite_ticket新值用以提升安全性。
          // 应用在获取到新的时值时，保存db成功后，返回给钉钉success加密串（如本demo的return）
          log.info("应用suite_ticket数据推送: " + plainText);

          String suiteTicket = obj.getString("SuiteTicket");

          DingTalkAppletContext.context().getBean(DingTalkCallbackService.class).processSuiteTicketEvent(suiteTicket);

          break;

        case EVENT_TMP_AUTH_CODE:
          // 本事件应用应该异步进行授权开通企业的初始化，目的是尽最大努力快速返回给钉钉服务端。用以提升企业管理员开通应用体验
          // 即使本接口没有收到数据或者收到事件后处理初始化失败都可以后续再用户试用应用时从前端获取到corpId并拉取授权企业信息，
          // 进而初始化开通及企业。
          log.info("企业授权开通应用事件: " + plainText);
          break;

        default:
          break;
      }

      // result
      Map<String, String> result =
          dingTalkEncryptor.getEncryptedMap(
              CALLBACK_RESPONSE_SUCCESS, System.currentTimeMillis(), Utils.getRandomStr(8));

      return Response.status(Response.Status.OK).entity(result).build();

    } catch (IOException e) {
      log.info("[==DingTalk Callback==] read callback payload happen-ed exception", e);
    } catch (DingTalkEncryptException e) {
      log.info("[==DingTalk Callback==] encrypt execute happen-ed exception", e);
    }

    // DEFAULT FAILED
    return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
  }

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  private static class CallbackPayload implements Serializable {
    private String encrypt;
  }
}
