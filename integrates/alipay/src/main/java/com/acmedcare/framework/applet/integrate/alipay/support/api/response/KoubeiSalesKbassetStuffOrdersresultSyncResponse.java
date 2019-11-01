package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AccessOrdersFeedBackResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.ordersresult.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiSalesKbassetStuffOrdersresultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3781933512747153833L;

	/** 
	 * 物料单据反馈结果
	 */
	@ApiListField("orders_feedback_result")
	@ApiField("access_orders_feed_back_result")
	private List<AccessOrdersFeedBackResult> ordersFeedbackResult;

	public void setOrdersFeedbackResult(List<AccessOrdersFeedBackResult> ordersFeedbackResult) {
		this.ordersFeedbackResult = ordersFeedbackResult;
	}
	public List<AccessOrdersFeedBackResult> getOrdersFeedbackResult( ) {
		return this.ordersFeedbackResult;
	}

}
