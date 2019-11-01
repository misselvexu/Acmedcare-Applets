package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MerchantOnlineActivityOpenModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-07 10:06:38
 */
public class KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6394789245193976934L;

	/** 
	 * 活动信息
	 */
	@ApiListField("activities")
	@ApiField("merchant_online_activity_open_model")
	private List<MerchantOnlineActivityOpenModel> activities;

	public void setActivities(List<MerchantOnlineActivityOpenModel> activities) {
		this.activities = activities;
	}
	public List<MerchantOnlineActivityOpenModel> getActivities( ) {
		return this.activities;
	}

}
