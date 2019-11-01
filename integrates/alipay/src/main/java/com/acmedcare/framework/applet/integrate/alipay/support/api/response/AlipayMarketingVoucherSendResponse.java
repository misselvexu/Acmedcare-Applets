package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 10:31:20
 */
public class AlipayMarketingVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5849674346161275959L;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
