package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DiscountInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDeliveryDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6212618159275966179L;

	/** 
	 * 广告投放出去的优惠信息
	 */
	@ApiField("discount")
	private DiscountInfo discount;

	public void setDiscount(DiscountInfo discount) {
		this.discount = discount;
	}
	public DiscountInfo getDiscount( ) {
		return this.discount;
	}

}
