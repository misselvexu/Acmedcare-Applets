package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prizepool.prize.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-19 16:10:01
 */
public class AlipayMarketingCampaignPrizepoolPrizeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1633474318416152794L;

	/** 
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

}
