package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-01 14:30:37
 */
public class AlipayUserCertdocUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4131278551831212779L;

	/** 
	 * 链接
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
