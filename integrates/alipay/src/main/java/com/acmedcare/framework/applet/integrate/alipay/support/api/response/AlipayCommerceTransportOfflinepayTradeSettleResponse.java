package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayOfflineTradeResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.trade.settle response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportOfflinepayTradeSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 4125757853851822669L;

	/** 
	 * 支付宝脱机交易处理结果列表
	 */
	@ApiListField("result_list")
	@ApiField("alipay_offline_trade_result")
	private List<AlipayOfflineTradeResult> resultList;

	public void setResultList(List<AlipayOfflineTradeResult> resultList) {
		this.resultList = resultList;
	}
	public List<AlipayOfflineTradeResult> getResultList( ) {
		return this.resultList;
	}

}
