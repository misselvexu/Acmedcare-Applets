package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.token.third.trust.login response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserAntpaasTokenThirdTrustLoginResponse extends AlipayResponse {

	private static final long serialVersionUID = 3257124565129724296L;

	/** 
	 * third_trust_token：用户免登的一次性token；后续使用改token进行免登请求。
	 */
	@ApiField("third_trust_token")
	private String thirdTrustToken;

	public void setThirdTrustToken(String thirdTrustToken) {
		this.thirdTrustToken = thirdTrustToken;
	}
	public String getThirdTrustToken( ) {
		return this.thirdTrustToken;
	}

}
