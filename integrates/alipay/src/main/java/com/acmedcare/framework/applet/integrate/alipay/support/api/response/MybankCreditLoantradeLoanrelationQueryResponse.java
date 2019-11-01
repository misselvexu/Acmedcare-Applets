package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditLoantradeLoanrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8168736148541591451L;

	/** 
	 * 是否有融资关系的标志
	 */
	@ApiField("loan_relation_flag")
	private Boolean loanRelationFlag;

	public void setLoanRelationFlag(Boolean loanRelationFlag) {
		this.loanRelationFlag = loanRelationFlag;
	}
	public Boolean getLoanRelationFlag( ) {
		return this.loanRelationFlag;
	}

}
