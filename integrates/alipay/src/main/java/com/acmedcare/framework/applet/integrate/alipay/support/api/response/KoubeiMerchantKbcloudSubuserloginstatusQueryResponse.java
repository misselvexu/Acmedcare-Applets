package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.UserLoginStatusDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.subuserloginstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbcloudSubuserloginstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6693418111322911418L;

	/** 
	 * 口碑云登录的子账号信息；如果未登录则返回null
	 */
	@ApiField("user_login_status")
	private UserLoginStatusDetail userLoginStatus;

	public void setUserLoginStatus(UserLoginStatusDetail userLoginStatus) {
		this.userLoginStatus = userLoginStatus;
	}
	public UserLoginStatusDetail getUserLoginStatus( ) {
		return this.userLoginStatus;
	}

}
