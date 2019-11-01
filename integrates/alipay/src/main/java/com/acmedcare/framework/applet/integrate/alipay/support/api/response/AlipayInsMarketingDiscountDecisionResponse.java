package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsMktCouponCampaignDTO;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsMktCouponDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.discount.decision response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:30
 */
public class AlipayInsMarketingDiscountDecisionResponse extends AlipayResponse {

	private static final long serialVersionUID = 8577819895781499148L;

	/** 
	 * 该订单可以享受的事后权益
	 */
	@ApiListField("mkt_coupon_campaigns")
	@ApiField("ins_mkt_coupon_campaign_d_t_o")
	private List<InsMktCouponCampaignDTO> mktCouponCampaigns;

	/** 
	 * 本次优惠咨询可以使用的权益权益列表
	 */
	@ApiListField("mkt_coupons")
	@ApiField("ins_mkt_coupon_d_t_o")
	private List<InsMktCouponDTO> mktCoupons;

	public void setMktCouponCampaigns(List<InsMktCouponCampaignDTO> mktCouponCampaigns) {
		this.mktCouponCampaigns = mktCouponCampaigns;
	}
	public List<InsMktCouponCampaignDTO> getMktCouponCampaigns( ) {
		return this.mktCouponCampaigns;
	}

	public void setMktCoupons(List<InsMktCouponDTO> mktCoupons) {
		this.mktCoupons = mktCoupons;
	}
	public List<InsMktCouponDTO> getMktCoupons( ) {
		return this.mktCoupons;
	}

}
