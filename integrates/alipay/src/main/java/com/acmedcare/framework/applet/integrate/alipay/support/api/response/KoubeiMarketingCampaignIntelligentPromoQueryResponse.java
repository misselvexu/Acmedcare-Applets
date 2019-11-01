package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IntelligentPromo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignIntelligentPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7123269629644676195L;

	/** 
	 * 查询返回的营销活动模型
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
