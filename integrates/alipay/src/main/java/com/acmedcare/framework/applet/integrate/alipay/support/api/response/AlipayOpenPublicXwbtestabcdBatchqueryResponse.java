package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.xwbtestabcd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7539433216885884386L;

	/** 
	 * 1111
	 */
	@ApiField("b")
	private String b;

	public void setB(String b) {
		this.b = b;
	}
	public String getB( ) {
		return this.b;
	}

}
