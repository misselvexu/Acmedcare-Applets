package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.digest.unlimited.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 10:50:01
 */
public class AlipayMerchantOrderDigestUnlimitedBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1434664986253759368L;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 订单信息列表，当存在符合条件的订单时，则返回订单信息；
	 */
	@ApiListField("order_list")
	@ApiField("alipay_order_data_openapi_result_info")
	private List<AlipayOrderDataOpenapiResultInfo> orderList;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setOrderList(List<AlipayOrderDataOpenapiResultInfo> orderList) {
		this.orderList = orderList;
	}
	public List<AlipayOrderDataOpenapiResultInfo> getOrderList( ) {
		return this.orderList;
	}

}
