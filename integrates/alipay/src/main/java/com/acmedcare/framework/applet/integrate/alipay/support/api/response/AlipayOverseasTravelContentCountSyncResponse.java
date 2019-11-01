package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.count.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasTravelContentCountSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5613892972868727692L;

	/** 
	 * 详细错误码。可选，当code=40004，sub_code=BUSINESS_ERROR，不为为空
	 */
	@ApiField("results")
	private String results;

	public void setResults(String results) {
		this.results = results;
	}
	public String getResults( ) {
		return this.results;
	}

}
