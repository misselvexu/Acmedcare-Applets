package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动查询
 *
 * @author auto create
 * @since 1.0, 2018-10-17 14:15:50
 */
public class AlipayMarketingCampaignDrawcampQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7547231619263421249L;

	/**
	 * 抽奖活动id，通过alipay.marketing.campaign.drawcamp.create接口返回
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
