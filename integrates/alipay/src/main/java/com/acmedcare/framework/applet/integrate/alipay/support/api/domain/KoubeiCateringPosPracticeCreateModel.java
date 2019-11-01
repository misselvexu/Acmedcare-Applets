package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 新增做法
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:19:43
 */
public class KoubeiCateringPosPracticeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3845924953232649277L;

	/**
	 * 做法名称
	 */
	@ApiField("practice_name")
	private String practiceName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getPracticeName() {
		return this.practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
