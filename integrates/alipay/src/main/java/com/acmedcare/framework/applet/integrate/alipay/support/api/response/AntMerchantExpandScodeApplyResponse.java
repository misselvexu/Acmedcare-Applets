package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ApplyCodeResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-19 22:33:11
 */
public class AntMerchantExpandScodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211242924339999353L;

	/** 
	 * apply_code_response, S码申请的结果对象
	 */
	@ApiField("apply_code_response")
	private ApplyCodeResponse applyCodeResponse;

	public void setApplyCodeResponse(ApplyCodeResponse applyCodeResponse) {
		this.applyCodeResponse = applyCodeResponse;
	}
	public ApplyCodeResponse getApplyCodeResponse( ) {
		return this.applyCodeResponse;
	}

}
