package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:26
 */
public class AlipayCommerceIotAdvertiserAdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2351558523579197272L;

	/** 
	 * 投放计划id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
