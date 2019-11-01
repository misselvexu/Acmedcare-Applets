package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询
 *
 * @author auto create
 * @since 1.0, 2019-04-18 17:14:48
 */
public class ZhimaCreditEpSceneRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2389162274435416482L;

	/**
	 * 芝麻企业信用评估订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
