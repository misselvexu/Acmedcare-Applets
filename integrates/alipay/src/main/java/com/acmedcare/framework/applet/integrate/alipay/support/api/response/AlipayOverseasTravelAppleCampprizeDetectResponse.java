package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PrizeLiteInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.apple.campprize.detect response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasTravelAppleCampprizeDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 2312674174315213468L;

	/** 
	 * 奖品简要信息列表，一定不为null，但是size可以为0
	 */
	@ApiListField("prizes")
	@ApiField("prize_lite_info")
	private List<PrizeLiteInfo> prizes;

	public void setPrizes(List<PrizeLiteInfo> prizes) {
		this.prizes = prizes;
	}
	public List<PrizeLiteInfo> getPrizes( ) {
		return this.prizes;
	}

}
