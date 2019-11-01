package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.vid.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditAutofinanceVidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7844652792337597944L;

	/** 
	 * 核身VID
	 */
	@ApiField("verifyid")
	private String verifyid;

	public void setVerifyid(String verifyid) {
		this.verifyid = verifyid;
	}
	public String getVerifyid( ) {
		return this.verifyid;
	}

}
