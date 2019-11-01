package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.region.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationRegionQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4674678294645157334L;

	/** 
	 * 快捷投保产品二维码图片链接URL
	 */
	@ApiField("code_url")
	private String codeUrl;

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}
	public String getCodeUrl( ) {
		return this.codeUrl;
	}

}
