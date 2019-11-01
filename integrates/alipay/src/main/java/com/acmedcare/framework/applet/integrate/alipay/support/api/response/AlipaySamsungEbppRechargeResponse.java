package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.samsung.ebpp.recharge response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipaySamsungEbppRechargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2852927583551718772L;

	/** 
	 * 直接返回页面
	 */
	@ApiField("page_retrun")
	private String pageRetrun;

	public void setPageRetrun(String pageRetrun) {
		this.pageRetrun = pageRetrun;
	}
	public String getPageRetrun( ) {
		return this.pageRetrun;
	}

}
