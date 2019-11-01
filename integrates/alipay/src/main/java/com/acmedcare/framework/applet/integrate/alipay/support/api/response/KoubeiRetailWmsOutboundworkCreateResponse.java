package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsOutboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5151542994554882779L;

	/** 
	 * 出库作业id
	 */
	@ApiField("outbound_work_id")
	private String outboundWorkId;

	public void setOutboundWorkId(String outboundWorkId) {
		this.outboundWorkId = outboundWorkId;
	}
	public String getOutboundWorkId( ) {
		return this.outboundWorkId;
	}

}
