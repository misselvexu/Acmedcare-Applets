package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FrontCategoryInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.frontcategory.security.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 21:53:19
 */
public class AntMerchantExpandFrontcategorySecurityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3236762132876252852L;

	/** 
	 * 前台类目列表
	 */
	@ApiListField("front_category_list")
	@ApiField("front_category_info")
	private List<FrontCategoryInfo> frontCategoryList;

	public void setFrontCategoryList(List<FrontCategoryInfo> frontCategoryList) {
		this.frontCategoryList = frontCategoryList;
	}
	public List<FrontCategoryInfo> getFrontCategoryList( ) {
		return this.frontCategoryList;
	}

}
