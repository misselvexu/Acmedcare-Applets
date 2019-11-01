package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.detail.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignDetailInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7743978577999673332L;

	/** 
	 * 适用门店:门店与门店之间用“,”隔开
	 */
	@ApiField("limit_shops")
	private String limitShops;

	public void setLimitShops(String limitShops) {
		this.limitShops = limitShops;
	}
	public String getLimitShops( ) {
		return this.limitShops;
	}

}
