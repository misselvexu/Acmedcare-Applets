package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 银行卡信息
 *
 * @author auto create
 * @since 1.0, 2018-05-22 17:58:29
 */
public class AlipayIserviceCognitiveOcrBankcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5861729644191698954L;

	/**
	 * 图片base64后内容，大小控制在1M以内
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
