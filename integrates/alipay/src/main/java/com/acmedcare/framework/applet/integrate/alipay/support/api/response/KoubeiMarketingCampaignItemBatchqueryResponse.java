package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromoItemInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2289729862129943396L;

	/** 
	 * 返回商品券集合信息
	 */
	@ApiListField("items")
	@ApiField("promo_item_info")
	private List<PromoItemInfo> items;

	public void setItems(List<PromoItemInfo> items) {
		this.items = items;
	}
	public List<PromoItemInfo> getItems( ) {
		return this.items;
	}

}
