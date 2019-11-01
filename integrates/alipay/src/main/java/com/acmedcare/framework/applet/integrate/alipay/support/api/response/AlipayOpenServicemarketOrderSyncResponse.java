package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-01 14:20:01
 */
public class AlipayOpenServicemarketOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5184586921554393676L;

	/** 
	 * 服务市场订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
