package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询凤蝶H5页面详情
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class AlipayMarketingToolFengdieActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4346385183734748276L;

	/**
	 * H5应用的唯一id，调用alipay.marketing.tool.fengdie.activity.create获得
	 */
	@ApiField("activity_id")
	private Long activityId;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

}
