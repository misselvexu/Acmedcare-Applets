package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4384231759851571985L;

	/** 
	 * 跳转至支付宝地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/** 
	 * 还款申请受理单号
	 */
	@ApiField("repay_receipt_no")
	private String repayReceiptNo;

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

	public void setRepayReceiptNo(String repayReceiptNo) {
		this.repayReceiptNo = repayReceiptNo;
	}
	public String getRepayReceiptNo( ) {
		return this.repayReceiptNo;
	}

}
