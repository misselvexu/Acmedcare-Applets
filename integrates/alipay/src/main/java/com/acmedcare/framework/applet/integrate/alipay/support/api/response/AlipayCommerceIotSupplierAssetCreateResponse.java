package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:51:42
 */
public class AlipayCommerceIotSupplierAssetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8338631766661339258L;

	/** 
	 * 记录id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
