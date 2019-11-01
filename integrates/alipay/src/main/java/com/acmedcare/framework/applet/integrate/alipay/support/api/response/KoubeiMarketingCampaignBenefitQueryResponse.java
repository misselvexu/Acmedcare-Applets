package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BenefitQueryInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8463565992892448689L;

	/** 
	 * benefitQueryInfo: 权益查询接口返回的具体权益信息
	 */
	@ApiField("benefit_query_info")
	private BenefitQueryInfo benefitQueryInfo;

	public void setBenefitQueryInfo(BenefitQueryInfo benefitQueryInfo) {
		this.benefitQueryInfo = benefitQueryInfo;
	}
	public BenefitQueryInfo getBenefitQueryInfo( ) {
		return this.benefitQueryInfo;
	}

}
