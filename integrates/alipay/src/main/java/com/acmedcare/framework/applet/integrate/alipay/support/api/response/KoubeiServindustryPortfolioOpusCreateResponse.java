package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OpusCreateResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.opus.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiServindustryPortfolioOpusCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2149344422618359469L;

	/** 
	 * 作品列表
	 */
	@ApiField("opuses")
	private OpusCreateResponse opuses;

	public void setOpuses(OpusCreateResponse opuses) {
		this.opuses = opuses;
	}
	public OpusCreateResponse getOpuses( ) {
		return this.opuses;
	}

}
