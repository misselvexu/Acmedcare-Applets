package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PayModeModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.paymode.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-16 18:35:00
 */
public class KoubeiCateringPosPaymodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3869957357121981463L;

	/** 
	 * 支付方式列表
	 */
	@ApiListField("pay_mode_model_list")
	@ApiField("pay_mode_model")
	private List<PayModeModel> payModeModelList;

	public void setPayModeModelList(List<PayModeModel> payModeModelList) {
		this.payModeModelList = payModeModelList;
	}
	public List<PayModeModel> getPayModeModelList( ) {
		return this.payModeModelList;
	}

}
