package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsMktCampaignDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.decision response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:48
 */
public class AlipayInsMarketingCampaignDecisionResponse extends AlipayResponse {

	private static final long serialVersionUID = 6894774366187114642L;

	/** 
	 * 保险营销标的关联的活动列表
	 */
	@ApiListField("mkt_campaigns")
	@ApiField("ins_mkt_campaign_d_t_o")
	private List<InsMktCampaignDTO> mktCampaigns;

	public void setMktCampaigns(List<InsMktCampaignDTO> mktCampaigns) {
		this.mktCampaigns = mktCampaigns;
	}
	public List<InsMktCampaignDTO> getMktCampaigns( ) {
		return this.mktCampaigns;
	}

}
