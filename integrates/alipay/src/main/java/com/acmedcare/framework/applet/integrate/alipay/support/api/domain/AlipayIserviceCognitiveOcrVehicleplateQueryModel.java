package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 车牌识别
 *
 * @author auto create
 * @since 1.0, 2018-05-09 12:20:04
 */
public class AlipayIserviceCognitiveOcrVehicleplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2132157144138433732L;

	/**
	 * 车牌图片base64加密后内容
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
