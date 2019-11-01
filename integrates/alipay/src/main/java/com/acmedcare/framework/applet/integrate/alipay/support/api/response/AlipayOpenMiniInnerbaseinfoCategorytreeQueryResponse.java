package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MiniAppFirstCategoryInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.categorytree.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniInnerbaseinfoCategorytreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6599817238353798635L;

	/** 
	 * 小程序一级类目列表
	 */
	@ApiListField("category_list")
	@ApiField("mini_app_first_category_info")
	private List<MiniAppFirstCategoryInfo> categoryList;

	public void setCategoryList(List<MiniAppFirstCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}
	public List<MiniAppFirstCategoryInfo> getCategoryList( ) {
		return this.categoryList;
	}

}
