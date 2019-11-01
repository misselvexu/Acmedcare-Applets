package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 17:46:02
 */
public class AlipayAssetPointPointprodBudgetlibAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7684768645267383884L;

	/** 
	 * 当order_no发生幂等时返回的错误信息
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
