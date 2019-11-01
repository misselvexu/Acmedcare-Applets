package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 根据门店ID查询桌位
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:19:55
 */
public class KoubeiCateringPosDeskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6888195359995593486L;

	/**
	 * 门店ID
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
