package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInboundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1562716121674613668L;

	/** 
	 * 入库通知单id
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
	}
	public String getInboundOrderId( ) {
		return this.inboundOrderId;
	}

}
