package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.user.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-14 16:29:18
 */
public class AlipayCommerceLogisticsUserOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3773327794282676359L;

	/** 
	 * 格式 : json , 目前 json 的 key 有 biz_unique_no
	 */
	@ApiField("order_info")
	private String orderInfo;

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getOrderInfo( ) {
		return this.orderInfo;
	}

}
