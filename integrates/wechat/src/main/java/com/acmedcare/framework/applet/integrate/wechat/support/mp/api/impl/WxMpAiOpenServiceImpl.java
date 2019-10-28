package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpAiOpenService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.AiLangType;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.voice.VoiceUploadRequestExecutor;
import com.google.gson.JsonParser;
import lombok.RequiredArgsConstructor;

import java.io.File;

/**
 *
 *
 * <pre>
 *  Created by BinaryWang on 2018/6/9.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@RequiredArgsConstructor
public class WxMpAiOpenServiceImpl implements WxMpAiOpenService {
  private static final JsonParser JSON_PARSER = new JsonParser();
  private final WxMpService wxMpService;

  @Override
  public void uploadVoice(String voiceId, AiLangType lang, File voiceFile) throws WxErrorException {
    if (lang == null) {
      lang = AiLangType.zh_CN;
    }

    this.wxMpService.execute(
        VoiceUploadRequestExecutor.create(this.wxMpService.getRequestHttp()),
        String.format(
            WxMpApiUrl.AiOpen.VOICE_UPLOAD_URL.getUrl(this.wxMpService.getWxMpConfigStorage()),
            "mp3",
            voiceId,
            lang.getCode()),
        voiceFile);
  }

  @Override
  public String recogniseVoice(String voiceId, AiLangType lang, File voiceFile)
      throws WxErrorException {
    this.uploadVoice(voiceId, lang, voiceFile);
    return this.queryRecognitionResult(voiceId, lang);
  }

  @Override
  public String translate(AiLangType langFrom, AiLangType langTo, String content)
      throws WxErrorException {
    String response =
        this.wxMpService.post(
            String.format(
                WxMpApiUrl.AiOpen.TRANSLATE_URL.getUrl(this.wxMpService.getWxMpConfigStorage()),
                langFrom.getCode(),
                langTo.getCode()),
            content);

    WxError error = WxError.fromJson(response, WxType.MP);
    if (error.getErrorCode() != 0) {
      throw new WxErrorException(error);
    }

    return JSON_PARSER.parse(response).getAsJsonObject().get("to_content").getAsString();
  }

  @Override
  public String queryRecognitionResult(String voiceId, AiLangType lang) throws WxErrorException {
    if (lang == null) {
      lang = AiLangType.zh_CN;
    }

    final String response =
        this.wxMpService.get(
            WxMpApiUrl.AiOpen.VOICE_QUERY_RESULT_URL,
            String.format("voice_id=%s&lang=%s", voiceId, lang.getCode()));
    WxError error = WxError.fromJson(response, WxType.MP);
    if (error.getErrorCode() != 0) {
      throw new WxErrorException(error);
    }

    return JSON_PARSER.parse(response).getAsJsonObject().get("result").getAsString();
  }
}
