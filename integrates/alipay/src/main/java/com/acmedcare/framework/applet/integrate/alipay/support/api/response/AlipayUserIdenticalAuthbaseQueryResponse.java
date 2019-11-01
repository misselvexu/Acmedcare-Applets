package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.identical.authbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-22 11:00:11
 */
public class AlipayUserIdenticalAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2265537765273946969L;

	/** 
	 * 是否是同人账号
	 */
	@ApiField("identical")
	private Boolean identical;

	public void setIdentical(Boolean identical) {
		this.identical = identical;
	}
	public Boolean getIdentical( ) {
		return this.identical;
	}

}
