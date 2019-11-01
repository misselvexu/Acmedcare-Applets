package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.activity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-09 09:31:19
 */
public class AlipayInsSceneHealthActivitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5885875358267436131L;

	/** 
	 * 申请编号，成功返回原申请编号，失败为空
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
