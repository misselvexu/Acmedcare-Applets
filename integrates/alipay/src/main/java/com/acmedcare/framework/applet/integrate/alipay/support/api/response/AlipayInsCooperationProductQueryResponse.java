package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsProduct;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 22:59:35
 */
public class AlipayInsCooperationProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1139696373118888775L;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

	public void setProduct(InsProduct product) {
		this.product = product;
	}
	public InsProduct getProduct( ) {
		return this.product;
	}

}
