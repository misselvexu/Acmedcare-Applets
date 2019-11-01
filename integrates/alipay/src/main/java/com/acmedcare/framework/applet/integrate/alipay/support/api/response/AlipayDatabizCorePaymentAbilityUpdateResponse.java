package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PaymentAbilityPostbackResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.payment.ability.update response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-14 15:25:09
 */
public class AlipayDatabizCorePaymentAbilityUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6484494732612833136L;

	/** 
	 * 支付能力回传信息结果信息
	 */
	@ApiField("payment_ability_postback_response")
	private PaymentAbilityPostbackResponse paymentAbilityPostbackResponse;

	public void setPaymentAbilityPostbackResponse(PaymentAbilityPostbackResponse paymentAbilityPostbackResponse) {
		this.paymentAbilityPostbackResponse = paymentAbilityPostbackResponse;
	}
	public PaymentAbilityPostbackResponse getPaymentAbilityPostbackResponse( ) {
		return this.paymentAbilityPostbackResponse;
	}

}
