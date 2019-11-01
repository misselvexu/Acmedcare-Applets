package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AdPlan;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.plan.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdPlanGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6842853181956246358L;

	/** 
	 * 计划详情
	 */
	@ApiField("plan_result")
	private AdPlan planResult;

	public void setPlanResult(AdPlan planResult) {
		this.planResult = planResult;
	}
	public AdPlan getPlanResult( ) {
		return this.planResult;
	}

}
