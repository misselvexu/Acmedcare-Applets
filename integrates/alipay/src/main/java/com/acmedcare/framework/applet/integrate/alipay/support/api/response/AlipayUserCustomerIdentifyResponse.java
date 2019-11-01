package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayUserCustIdentifyActivity;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.customer.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCustomerIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1492895518416558348L;

	/** 
	 * 账户互通活动信息列表，目前支持的活动名称
PAYMENT_NEW_CUSTOMER, 支付拉新
	 */
	@ApiListField("activity_list")
	@ApiField("alipay_user_cust_identify_activity")
	private List<AlipayUserCustIdentifyActivity> activityList;

	/** 
	 * 用户画像信息，预留参数。返回用户画像信息，例如用户特征或者其他脱敏后的信息。
	 */
	@ApiField("user_profile")
	private String userProfile;

	public void setActivityList(List<AlipayUserCustIdentifyActivity> activityList) {
		this.activityList = activityList;
	}
	public List<AlipayUserCustIdentifyActivity> getActivityList( ) {
		return this.activityList;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public String getUserProfile( ) {
		return this.userProfile;
	}

}
