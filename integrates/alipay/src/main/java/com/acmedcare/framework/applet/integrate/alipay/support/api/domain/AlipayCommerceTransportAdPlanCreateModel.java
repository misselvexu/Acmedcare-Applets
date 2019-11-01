package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 出行广告计划添加
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:33
 */
public class AlipayCommerceTransportAdPlanCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6895588926752676153L;

	/**
	 * 复杂类型，参见AdPlan定义
	 */
	@ApiField("ad_plan")
	private AdPlan adPlan;

	public AdPlan getAdPlan() {
		return this.adPlan;
	}
	public void setAdPlan(AdPlan adPlan) {
		this.adPlan = adPlan;
	}

}
