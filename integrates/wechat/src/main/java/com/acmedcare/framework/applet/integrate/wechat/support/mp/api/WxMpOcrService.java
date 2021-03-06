package com.acmedcare.framework.applet.integrate.wechat.support.mp.api;

import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.ocr.WxMpOcrIdCardResult;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.File;

/**
 * 基于小程序或 H5 的身份证、银行卡、行驶证 OCR 识别.
 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=21516712284rHWMX
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2019-06-22
 */
public interface WxMpOcrService {
  /**
   * 身份证OCR识别接口.
   *
   * @param imgType 图片类型
   * @param imgUrl 图片url地址
   * @throws WxErrorException .
   */
  WxMpOcrIdCardResult idCard(ImageType imgType, String imgUrl) throws WxErrorException;

  /**
   * 身份证OCR识别接口.
   *
   * @param imgType 图片类型
   * @param imgFile 图片文件对象
   * @throws WxErrorException .
   */
  WxMpOcrIdCardResult idCard(ImageType imgType, File imgFile) throws WxErrorException;

  @AllArgsConstructor
  @Getter
  enum ImageType {
    /** 拍照模型，带背景的图片. */
    PHOTO("photo"),
    /** 扫描模式，不带背景的图片. */
    SCAN("scan");

    private String type;
  }
}
