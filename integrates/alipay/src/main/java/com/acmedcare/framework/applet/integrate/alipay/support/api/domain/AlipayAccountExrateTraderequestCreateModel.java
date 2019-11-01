package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 受理外汇交易请求
 *
 * @author auto create
 * @since 1.0, 2018-04-13 17:35:02
 */
public class AlipayAccountExrateTraderequestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3697148466555158321L;

	/**
	 * 交易请求对象内容
	 */
	@ApiField("trade_request")
	private TradeRequestVO tradeRequest;

	public TradeRequestVO getTradeRequest() {
		return this.tradeRequest;
	}
	public void setTradeRequest(TradeRequestVO tradeRequest) {
		this.tradeRequest = tradeRequest;
	}

}
