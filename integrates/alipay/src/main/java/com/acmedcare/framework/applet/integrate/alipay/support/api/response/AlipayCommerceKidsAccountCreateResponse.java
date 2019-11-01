package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-08 11:23:27
 */
public class AlipayCommerceKidsAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6764496866581164779L;

	/** 
	 * 儿童唯一id
	 */
	@ApiField("child_id")
	private String childId;

	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getChildId( ) {
		return this.childId;
	}

}
