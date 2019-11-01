package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AccessPurchaseOrderSendResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.purordersend.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiSalesKbassetStuffPurordersendSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7657177246452885995L;

	/** 
	 * 供应商同步发货信息及物流信息处理结果列表
	 */
	@ApiListField("purchase_order_send_results")
	@ApiField("access_purchase_order_send_result")
	private List<AccessPurchaseOrderSendResult> purchaseOrderSendResults;

	public void setPurchaseOrderSendResults(List<AccessPurchaseOrderSendResult> purchaseOrderSendResults) {
		this.purchaseOrderSendResults = purchaseOrderSendResults;
	}
	public List<AccessPurchaseOrderSendResult> getPurchaseOrderSendResults( ) {
		return this.purchaseOrderSendResults;
	}

}
