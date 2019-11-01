package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExtShopItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.shopitem.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailShopitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4514742428697929485L;

	/** 
	 * 店铺商品集合
	 */
	@ApiListField("shopitemlist")
	@ApiField("ext_shop_item")
	private List<ExtShopItem> shopitemlist;

	public void setShopitemlist(List<ExtShopItem> shopitemlist) {
		this.shopitemlist = shopitemlist;
	}
	public List<ExtShopItem> getShopitemlist( ) {
		return this.shopitemlist;
	}

}
