package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExtBrand;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.brand.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiItemExtitemBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4321567673564127412L;

	/** 
	 * 品牌列表信息
	 */
	@ApiListField("brand_list")
	@ApiField("ext_brand")
	private List<ExtBrand> brandList;

	public void setBrandList(List<ExtBrand> brandList) {
		this.brandList = brandList;
	}
	public List<ExtBrand> getBrandList( ) {
		return this.brandList;
	}

}
