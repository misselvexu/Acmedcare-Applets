package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * OCR服务：识别车辆Vin码服务
 *
 * @author auto create
 * @since 1.0, 2019-04-26 12:36:57
 */
public class AlipayIserviceCognitiveOcrCarvinQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2871854728554933568L;

	/**
	 * 汽车VIN 图片base64 encode内容
	 */
	@ApiField("image_content")
	private String imageContent;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
