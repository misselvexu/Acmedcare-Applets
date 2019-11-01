package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CategoryVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4414294357529382354L;

	/** 
	 * 类目信息
	 */
	@ApiField("category")
	private CategoryVO category;

	/** 
	 * 子类目信息
	 */
	@ApiListField("sub_categories")
	@ApiField("category_v_o")
	private List<CategoryVO> subCategories;

	public void setCategory(CategoryVO category) {
		this.category = category;
	}
	public CategoryVO getCategory( ) {
		return this.category;
	}

	public void setSubCategories(List<CategoryVO> subCategories) {
		this.subCategories = subCategories;
	}
	public List<CategoryVO> getSubCategories( ) {
		return this.subCategories;
	}

}
