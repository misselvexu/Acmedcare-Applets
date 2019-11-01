package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 门店摘要信息
 *
 * @author auto create
 * @since 1.0, 2017-10-12 10:54:18
 */
public class IntelligentPromoShopSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 4171294167729527987L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 全店名
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
