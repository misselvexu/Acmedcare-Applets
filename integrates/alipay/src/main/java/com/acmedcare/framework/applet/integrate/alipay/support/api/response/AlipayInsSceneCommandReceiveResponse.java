package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.command.receive response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-20 22:25:00
 */
public class AlipayInsSceneCommandReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7646972946175982627L;

	/** 
	 * 执行结果JSON字符串
	 */
	@ApiField("result_object_string")
	private String resultObjectString;

	public void setResultObjectString(String resultObjectString) {
		this.resultObjectString = resultObjectString;
	}
	public String getResultObjectString( ) {
		return this.resultObjectString;
	}

}
