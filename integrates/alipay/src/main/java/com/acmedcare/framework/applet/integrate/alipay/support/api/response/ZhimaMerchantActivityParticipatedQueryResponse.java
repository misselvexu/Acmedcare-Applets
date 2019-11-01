package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ActivityParticipation;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.participated.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-14 20:58:15
 */
public class ZhimaMerchantActivityParticipatedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4885645282276627218L;

	/** 
	 * 用户参加活动模型列表
	 */
	@ApiListField("activity_participation_list")
	@ApiField("activity_participation")
	private List<ActivityParticipation> activityParticipationList;

	public void setActivityParticipationList(List<ActivityParticipation> activityParticipationList) {
		this.activityParticipationList = activityParticipationList;
	}
	public List<ActivityParticipation> getActivityParticipationList( ) {
		return this.activityParticipationList;
	}

}
