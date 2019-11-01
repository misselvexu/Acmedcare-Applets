package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.issue.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-28 14:20:47
 */
public class AlipayInsSceneApplicationIssueConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5261833553455555263L;

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

}
