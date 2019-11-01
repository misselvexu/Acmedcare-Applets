package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PrizeDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prize.send.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignPrizeSendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1681293714241745773L;

	/** 
	 * 中奖信息列表
	 */
	@ApiListField("prize_detail_list")
	@ApiField("prize_detail")
	private List<PrizeDetail> prizeDetailList;

	public void setPrizeDetailList(List<PrizeDetail> prizeDetailList) {
		this.prizeDetailList = prizeDetailList;
	}
	public List<PrizeDetail> getPrizeDetailList( ) {
		return this.prizeDetailList;
	}

}
