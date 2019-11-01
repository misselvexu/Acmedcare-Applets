package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.benefit.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-21 11:25:00
 */
public class AlipayPcreditHuabeiBenefitOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2666939175748128991L;

	/** 
	 * 权益订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户侧唯一请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
