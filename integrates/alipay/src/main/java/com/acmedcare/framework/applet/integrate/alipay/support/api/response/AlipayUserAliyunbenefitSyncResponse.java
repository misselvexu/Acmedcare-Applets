package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aliyunbenefit.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-26 20:06:45
 */
public class AlipayUserAliyunbenefitSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6752721245466268334L;

	/** 
	 * 权益Id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
