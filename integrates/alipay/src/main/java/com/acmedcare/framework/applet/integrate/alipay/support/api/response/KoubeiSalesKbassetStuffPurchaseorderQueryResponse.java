package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AccessPurchaseOrder;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.purchaseorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiSalesKbassetStuffPurchaseorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8861651115189459453L;

	/** 
	 * 采购单记录集合
	 */
	@ApiListField("asset_purchase_orders")
	@ApiField("access_purchase_order")
	private List<AccessPurchaseOrder> assetPurchaseOrders;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	public void setAssetPurchaseOrders(List<AccessPurchaseOrder> assetPurchaseOrders) {
		this.assetPurchaseOrders = assetPurchaseOrders;
	}
	public List<AccessPurchaseOrder> getAssetPurchaseOrders( ) {
		return this.assetPurchaseOrders;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}
