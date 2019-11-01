package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.check.iq.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-17 17:03:26
 */
public class AlipaySecurityProdCheckIqQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2777819442745622585L;

	/** 
	 * 1
	 */
	@ApiField("a")
	private String a;

	public void setA(String a) {
		this.a = a;
	}
	public String getA( ) {
		return this.a;
	}

}
