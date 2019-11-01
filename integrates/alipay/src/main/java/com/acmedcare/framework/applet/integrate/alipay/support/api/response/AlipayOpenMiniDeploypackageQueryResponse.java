package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.deploypackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 11:48:36
 */
public class AlipayOpenMiniDeploypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3121998162516573934L;

	/** 
	 * 包数据
	 */
	@ApiField("pack_json")
	private String packJson;

	public void setPackJson(String packJson) {
		this.packJson = packJson;
	}
	public String getPackJson( ) {
		return this.packJson;
	}

}
