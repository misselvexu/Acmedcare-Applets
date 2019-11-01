package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PointPrizeInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.prize.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:51
 */
public class AntfortuneEquityInstpointPrizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7854887796291967256L;

	/** 
	 * 积分可兑换奖品列表
	 */
	@ApiListField("prize_info")
	@ApiField("point_prize_info")
	private List<PointPrizeInfo> prizeInfo;

	/** 
	 * 可兑换奖品总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setPrizeInfo(List<PointPrizeInfo> prizeInfo) {
		this.prizeInfo = prizeInfo;
	}
	public List<PointPrizeInfo> getPrizeInfo( ) {
		return this.prizeInfo;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
