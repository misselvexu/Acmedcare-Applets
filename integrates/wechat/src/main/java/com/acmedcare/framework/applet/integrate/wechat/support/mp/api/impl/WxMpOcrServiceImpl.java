package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpOcrService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.ocr.WxMpOcrIdCardResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * ocr 接口实现.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2019-06-22
 */
@RequiredArgsConstructor
public class WxMpOcrServiceImpl implements WxMpOcrService {
  private final WxMpService wxMpService;

  @Override
  public WxMpOcrIdCardResult idCard(ImageType imgType, String imgUrl) throws WxErrorException {
    try {
      imgUrl = URLEncoder.encode(imgUrl, StandardCharsets.UTF_8.name());
    } catch (UnsupportedEncodingException e) {
      // ignore cannot happen
    }

    final String result =
        this.wxMpService.get(
            String.format(
                WxMpApiUrl.Ocr.IDCARD.getUrl(this.wxMpService.getWxMpConfigStorage()),
                imgType.getType(),
                imgUrl),
            null);
    return WxMpOcrIdCardResult.fromJson(result);
  }

  @Override
  public WxMpOcrIdCardResult idCard(ImageType imgType, File imgFile) {
    return null;
  }
}
