package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:54
 */
public class AlipayInsSceneInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7429841852955371573L;

	/** 
	 * 发票申请单号
	 */
	@ApiField("invoice_apply_no")
	private String invoiceApplyNo;

	/** 
	 * 商户生成的发票申请请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setInvoiceApplyNo(String invoiceApplyNo) {
		this.invoiceApplyNo = invoiceApplyNo;
	}
	public String getInvoiceApplyNo( ) {
		return this.invoiceApplyNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}