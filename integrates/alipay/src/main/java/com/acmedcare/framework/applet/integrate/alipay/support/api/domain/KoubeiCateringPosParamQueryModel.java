package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 获取系统参数配置
 *
 * @author auto create
 * @since 1.0, 2018-11-21 10:40:02
 */
public class KoubeiCateringPosParamQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2411695385963446973L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
