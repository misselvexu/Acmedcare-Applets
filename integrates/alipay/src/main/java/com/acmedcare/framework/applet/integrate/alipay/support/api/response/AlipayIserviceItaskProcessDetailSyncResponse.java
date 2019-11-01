package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceItaskProcessDetailSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1687524674184889981L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

	public void setAlipayProcessId(String alipayProcessId) {
		this.alipayProcessId = alipayProcessId;
	}
	public String getAlipayProcessId( ) {
		return this.alipayProcessId;
	}

}
