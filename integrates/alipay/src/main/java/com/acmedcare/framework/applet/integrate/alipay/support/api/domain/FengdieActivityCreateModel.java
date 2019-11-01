package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶站点返回值
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:57:49
 */
public class FengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4187731366484375779L;

	/**
	 * 云凤蝶站点的 id
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
