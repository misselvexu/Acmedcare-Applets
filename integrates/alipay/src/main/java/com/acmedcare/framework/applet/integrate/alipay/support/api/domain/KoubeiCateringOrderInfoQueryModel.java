package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * pos订单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-13 11:01:25
 */
public class KoubeiCateringOrderInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3152924695434583353L;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
