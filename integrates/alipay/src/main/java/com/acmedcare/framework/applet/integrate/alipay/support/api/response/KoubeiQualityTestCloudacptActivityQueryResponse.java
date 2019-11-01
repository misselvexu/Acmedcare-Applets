package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OpenActivity;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiQualityTestCloudacptActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5629243915778284533L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("open_activity")
	private List<OpenActivity> activityList;

	public void setActivityList(List<OpenActivity> activityList) {
		this.activityList = activityList;
	}
	public List<OpenActivity> getActivityList( ) {
		return this.activityList;
	}

}
