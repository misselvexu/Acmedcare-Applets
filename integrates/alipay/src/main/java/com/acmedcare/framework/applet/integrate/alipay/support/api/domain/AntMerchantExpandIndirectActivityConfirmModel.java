package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ant.merchant.expand.indirect.marking.activity.conf
 *
 * @author auto create
 * @since 1.0, 2018-12-29 10:16:15
 */
public class AntMerchantExpandIndirectActivityConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6788285853719255633L;

	/**
	 * 活动报名id
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
