package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IntelligentPromo;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromoPageResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8784828752695716147L;

	/** 
	 * 查询返回的营销活动列表信息
	 */
	@ApiListField("intelligent_promos")
	@ApiField("intelligent_promo")
	private List<IntelligentPromo> intelligentPromos;

	/** 
	 * 查询后返回的分页信息
	 */
	@ApiField("page_result")
	private PromoPageResult pageResult;

	public void setIntelligentPromos(List<IntelligentPromo> intelligentPromos) {
		this.intelligentPromos = intelligentPromos;
	}
	public List<IntelligentPromo> getIntelligentPromos( ) {
		return this.intelligentPromos;
	}

	public void setPageResult(PromoPageResult pageResult) {
		this.pageResult = pageResult;
	}
	public PromoPageResult getPageResult( ) {
		return this.pageResult;
	}

}
