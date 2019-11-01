package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.echo.offline.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-18 14:24:54
 */
public class AlipayOpenEchoOfflineSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5418632135965777138L;

	/** 
	 * 10000
	 */
	@ApiField("word")
	private String word;

	public void setWord(String word) {
		this.word = word;
	}
	public String getWord( ) {
		return this.word;
	}

}
