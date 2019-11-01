package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.setting.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-12 17:36:13
 */
public class AlipayOpenPublicSettingCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1624926518799897864L;

	/** 
	 * 返回已设置的一级行业分类名称
	 */
	@ApiField("primary_category")
	private String primaryCategory;

	/** 
	 * 返回已设置的二级行业分类名称
	 */
	@ApiField("secondary_category")
	private String secondaryCategory;

	public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}
	public String getPrimaryCategory( ) {
		return this.primaryCategory;
	}

	public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}
	public String getSecondaryCategory( ) {
		return this.secondaryCategory;
	}

}
