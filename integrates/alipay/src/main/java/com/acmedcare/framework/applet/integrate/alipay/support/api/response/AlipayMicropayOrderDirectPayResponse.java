package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SinglePayDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.direct.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-24 14:46:22
 */
public class AlipayMicropayOrderDirectPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8222283332393592614L;

	/** 
	 * 单笔直接支付返回结果
	 */
	@ApiField("single_pay_detail")
	private SinglePayDetail singlePayDetail;

	public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
		this.singlePayDetail = singlePayDetail;
	}
	public SinglePayDetail getSinglePayDetail( ) {
		return this.singlePayDetail;
	}

}
