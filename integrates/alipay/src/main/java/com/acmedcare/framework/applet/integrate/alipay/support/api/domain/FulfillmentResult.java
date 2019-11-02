package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 履约同步结果
 *
 * @author auto create
 * @since 1.0, 2019-04-17 16:51:28
 */
public class FulfillmentResult extends AlipayObject {

	private static final long serialVersionUID = 3444827552275985597L;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_order_no")
	private String fulfillmentOrderNo;

	/**
	 * 商户履约请求订单号。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getFulfillmentOrderNo() {
		return this.fulfillmentOrderNo;
	}
	public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
		this.fulfillmentOrderNo = fulfillmentOrderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}