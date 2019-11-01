package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.frontcategory.security.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 21:53:32
 */
public class AntMerchantExpandFrontcategorySecurityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8721614643146448472L;

	/** 
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}
	public String getFrontCategoryId( ) {
		return this.frontCategoryId;
	}

}
