package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7118115312673817611L;

	/** 
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

	public void setInboundWorkId(String inboundWorkId) {
		this.inboundWorkId = inboundWorkId;
	}
	public String getInboundWorkId( ) {
		return this.inboundWorkId;
	}

}
