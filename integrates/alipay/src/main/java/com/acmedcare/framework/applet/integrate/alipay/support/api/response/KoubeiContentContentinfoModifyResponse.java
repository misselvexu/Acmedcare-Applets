package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-15 10:30:13
 */
public class KoubeiContentContentinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8194882221779774816L;

	/** 
	 * 内容id
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 全链路Id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
