package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.user.detect response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-30 18:58:49
 */
public class AlipayEbppRechargeUserDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6561881661613258979L;

	/** 
	 * 是否是合法用户
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

}
