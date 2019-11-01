package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ParamModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.param.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosParamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7569993148837954146L;

	/** 
	 * 门店参数model
	 */
	@ApiField("param_model")
	private ParamModel paramModel;

	public void setParamModel(ParamModel paramModel) {
		this.paramModel = paramModel;
	}
	public ParamModel getParamModel( ) {
		return this.paramModel;
	}

}
