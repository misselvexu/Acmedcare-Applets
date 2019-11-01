package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4294988789853214664L;

	/** 
	 * 广告系统用户ID
	 */
	@ApiField("ad_user_id")
	private String adUserId;

	public void setAdUserId(String adUserId) {
		this.adUserId = adUserId;
	}
	public String getAdUserId( ) {
		return this.adUserId;
	}

}
