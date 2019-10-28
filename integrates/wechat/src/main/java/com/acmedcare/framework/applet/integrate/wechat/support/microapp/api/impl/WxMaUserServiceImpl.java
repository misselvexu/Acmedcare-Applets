package com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.SignUtils;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaUserService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaJscode2SessionResult;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaPhoneNumberInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaUserInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.config.WxMaConfig;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.crypt.WxMaCryptUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Map;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@AllArgsConstructor
public class WxMaUserServiceImpl implements WxMaUserService {
  private WxMaService service;

  @Override
  public WxMaJscode2SessionResult getSessionInfo(String jsCode) throws WxErrorException {
    return service.jsCode2SessionInfo(jsCode);
  }

  @Override
  public WxMaUserInfo getUserInfo(String sessionKey, String encryptedData, String ivStr) {
    return WxMaUserInfo.fromJson(WxMaCryptUtils.decrypt(sessionKey, encryptedData, ivStr));
  }

  @Override
  public void setUserStorage(Map<String, String> kvMap, String sessionKey, String openid)
      throws WxErrorException {
    final WxMaConfig config = this.service.getWxMaConfig();
    JsonObject param = new JsonObject();
    JsonArray array = new JsonArray();
    for (Map.Entry<String, String> e : kvMap.entrySet()) {
      JsonObject jsonObject = new JsonObject();
      jsonObject.addProperty("key", e.getKey());
      jsonObject.addProperty("value", e.getValue());
      array.add(jsonObject);
    }
    param.add("kv_list", array);
    String params = param.toString();
    String signature = SignUtils.createHmacSha256Sign(params, sessionKey);
    String url =
        String.format(SET_USER_STORAGE, config.getAppid(), signature, openid, "hmac_sha256");
    String result = this.service.post(url, params);
    WxError error = WxError.fromJson(result);
    if (error.getErrorCode() != 0) {
      throw new WxErrorException(error);
    }
  }

  @Override
  public WxMaPhoneNumberInfo getPhoneNoInfo(String sessionKey, String encryptedData, String ivStr) {
    return WxMaPhoneNumberInfo.fromJson(WxMaCryptUtils.decrypt(sessionKey, encryptedData, ivStr));
  }

  @Override
  public boolean checkUserInfo(String sessionKey, String rawData, String signature) {
    final String generatedSignature = DigestUtils.sha1Hex(rawData + sessionKey);
    return generatedSignature.equals(signature);
  }
}
