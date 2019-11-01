package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsMktPreUseCampaignDTO;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsMktPreUseCouponDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.discount.preuse response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:36
 */
public class AlipayInsMarketingDiscountPreuseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2345116599234171394L;

	/** 
	 * 预核销活动列表
	 */
	@ApiListField("pre_use_campaigns")
	@ApiField("ins_mkt_pre_use_campaign_d_t_o")
	private List<InsMktPreUseCampaignDTO> preUseCampaigns;

	/** 
	 * 预核销权益列表
	 */
	@ApiListField("pre_use_coupons")
	@ApiField("ins_mkt_pre_use_coupon_d_t_o")
	private List<InsMktPreUseCouponDTO> preUseCoupons;

	public void setPreUseCampaigns(List<InsMktPreUseCampaignDTO> preUseCampaigns) {
		this.preUseCampaigns = preUseCampaigns;
	}
	public List<InsMktPreUseCampaignDTO> getPreUseCampaigns( ) {
		return this.preUseCampaigns;
	}

	public void setPreUseCoupons(List<InsMktPreUseCouponDTO> preUseCoupons) {
		this.preUseCoupons = preUseCoupons;
	}
	public List<InsMktPreUseCouponDTO> getPreUseCoupons( ) {
		return this.preUseCoupons;
	}

}
