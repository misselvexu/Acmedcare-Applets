package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.GavintestNewLeveaOne;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.des.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-13 11:00:00
 */
public class AlipayOpenDesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5756896561673521173L;

	/** 
	 * 1
	 */
	@ApiField("ces")
	private GavintestNewLeveaOne ces;

	public void setCes(GavintestNewLeveaOne ces) {
		this.ces = ces;
	}
	public GavintestNewLeveaOne getCes( ) {
		return this.ces;
	}

}
