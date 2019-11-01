package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * isp预发验证专用
 *
 * @author auto create
 * @since 1.0, 2018-12-27 18:02:54
 */
public class AlipayOpenAppApiresQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5884754852917545267L;

	/**
	 * 订单号
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
