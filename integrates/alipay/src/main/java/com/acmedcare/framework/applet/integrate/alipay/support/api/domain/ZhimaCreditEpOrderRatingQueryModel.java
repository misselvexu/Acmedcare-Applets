package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询接口
 *
 * @author auto create
 * @since 1.0, 2019-03-04 11:32:51
 */
public class ZhimaCreditEpOrderRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4711386781417635461L;

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
