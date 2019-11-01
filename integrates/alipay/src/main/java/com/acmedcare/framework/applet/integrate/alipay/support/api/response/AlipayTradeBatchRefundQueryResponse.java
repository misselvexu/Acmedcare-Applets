package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BatchRefundDetailResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-08 15:20:17
 */
public class AlipayTradeBatchRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4821966451217899148L;

	/** 
	 * 退款明细信息
	 */
	@ApiListField("result_details")
	@ApiField("batch_refund_detail_result")
	private List<BatchRefundDetailResult> resultDetails;

	public void setResultDetails(List<BatchRefundDetailResult> resultDetails) {
		this.resultDetails = resultDetails;
	}
	public List<BatchRefundDetailResult> getResultDetails( ) {
		return this.resultDetails;
	}

}
