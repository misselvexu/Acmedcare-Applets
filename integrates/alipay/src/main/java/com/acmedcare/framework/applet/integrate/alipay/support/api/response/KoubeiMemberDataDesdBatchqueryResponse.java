package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.GavintestNewonline;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.desd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-12 13:55:01
 */
public class KoubeiMemberDataDesdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7669754546988388272L;

	/** 
	 * 21
	 */
	@ApiField("de")
	private GavintestNewonline de;

	public void setDe(GavintestNewonline de) {
		this.de = de;
	}
	public GavintestNewonline getDe( ) {
		return this.de;
	}

}
