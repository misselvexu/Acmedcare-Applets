package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.XXXXsdasdasd;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.test.practice response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaMerchantTestPracticeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5882753968756128164L;

	/** 
	 * xxxx
	 */
	@ApiField("dddd")
	private XXXXsdasdasd dddd;

	/** 
	 * ccc
	 */
	@ApiField("sss")
	private String sss;

	public void setDddd(XXXXsdasdasd dddd) {
		this.dddd = dddd;
	}
	public XXXXsdasdasd getDddd( ) {
		return this.dddd;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}
	public String getSss( ) {
		return this.sss;
	}

}
