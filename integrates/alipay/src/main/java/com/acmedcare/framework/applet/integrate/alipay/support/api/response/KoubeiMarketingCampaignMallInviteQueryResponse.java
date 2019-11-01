package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ActivityPlanInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.mall.invite.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignMallInviteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1128195357721287466L;

	/** 
	 * 平台活动招商信息列表
	 */
	@ApiListField("activity_plan_info_list")
	@ApiField("activity_plan_info")
	private List<ActivityPlanInfo> activityPlanInfoList;

	public void setActivityPlanInfoList(List<ActivityPlanInfo> activityPlanInfoList) {
		this.activityPlanInfoList = activityPlanInfoList;
	}
	public List<ActivityPlanInfo> getActivityPlanInfoList( ) {
		return this.activityPlanInfoList;
	}

}
