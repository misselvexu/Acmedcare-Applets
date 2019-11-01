package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invitetask.exchange.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserInvitetaskExchangeConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7319848631962981433L;

	/** 
	 * true-确认成功，可以进行下一步的代扣、发货
false-确认失败，不要进行下一步代扣
	 */
	@ApiField("confirm_result")
	private Boolean confirmResult;

	public void setConfirmResult(Boolean confirmResult) {
		this.confirmResult = confirmResult;
	}
	public Boolean getConfirmResult( ) {
		return this.confirmResult;
	}

}
