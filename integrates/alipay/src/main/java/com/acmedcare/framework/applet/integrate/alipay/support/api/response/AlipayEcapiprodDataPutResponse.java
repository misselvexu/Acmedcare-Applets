package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.data.put response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcapiprodDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 8876945387956362897L;

	/** 
	 * 数据版本
	 */
	@ApiField("data_version")
	private String dataVersion;

	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}
	public String getDataVersion( ) {
		return this.dataVersion;
	}

}
