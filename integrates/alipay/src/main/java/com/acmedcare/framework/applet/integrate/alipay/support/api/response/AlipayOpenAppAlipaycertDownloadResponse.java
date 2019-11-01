package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.alipaycert.download response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-20 18:15:01
 */
public class AlipayOpenAppAlipaycertDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8293663826414783918L;

	/** 
	 * 公钥证书Base64后的字符串
	 */
	@ApiField("alipay_cert_content")
	private String alipayCertContent;

	public void setAlipayCertContent(String alipayCertContent) {
		this.alipayCertContent = alipayCertContent;
	}
	public String getAlipayCertContent( ) {
		return this.alipayCertContent;
	}

}
