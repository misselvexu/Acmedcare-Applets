package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ShopPromoInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.shoppromoinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingMallShoppromoinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3246426675613355777L;

	/** 
	 * 店铺营销信息详情
	 */
	@ApiListField("shop_promo_infos")
	@ApiField("shop_promo_info")
	private List<ShopPromoInfo> shopPromoInfos;

	public void setShopPromoInfos(List<ShopPromoInfo> shopPromoInfos) {
		this.shopPromoInfos = shopPromoInfos;
	}
	public List<ShopPromoInfo> getShopPromoInfos( ) {
		return this.shopPromoInfos;
	}

}
