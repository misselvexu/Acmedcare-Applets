package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 子门店信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 15:59:38
 */
public class SubShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7193325146595894388L;

	/**
	 * 门店信息集合
	 */
	@ApiListField("shop_list")
	@ApiField("shop")
	private List<Shop> shopList;

	public List<Shop> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}

}
