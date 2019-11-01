package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TBMiniShopBo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.shopitems.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataMallShopitemsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7398266296194939257L;

	/** 
	 * 店铺信息
	 */
	@ApiListField("shop_list")
	@ApiField("t_b_mini_shop_bo")
	private List<TBMiniShopBo> shopList;

	public void setShopList(List<TBMiniShopBo> shopList) {
		this.shopList = shopList;
	}
	public List<TBMiniShopBo> getShopList( ) {
		return this.shopList;
	}

}
