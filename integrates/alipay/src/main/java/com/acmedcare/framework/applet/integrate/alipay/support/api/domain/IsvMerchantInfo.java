package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 商户信息列表
 *
 * @author auto create
 * @since 1.0, 2017-08-04 15:15:46
 */
public class IsvMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 5699459493692165162L;

	/**
	 * 商户pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 门店ID列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
