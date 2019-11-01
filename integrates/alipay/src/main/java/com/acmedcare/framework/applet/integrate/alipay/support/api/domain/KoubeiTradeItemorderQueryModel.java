package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品交易查询接口
 *
 * @author auto create
 * @since 1.0, 2018-08-19 23:31:33
 */
public class KoubeiTradeItemorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2839228658823562364L;

	/**
	 * 口碑订单号
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
