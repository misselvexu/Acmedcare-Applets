package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 优惠活动查看
 *
 * @author auto create
 * @since 1.0, 2019-05-15 15:30:59
 */
public class AlipayMarketingCampaignDiscountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5765767721239928493L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
