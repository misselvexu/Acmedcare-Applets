package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 支付宝脱机交易结算
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:01:08
 */
public class AlipayCommerceTransportOfflinepayTradeSettleModel extends AlipayObject {

	private static final long serialVersionUID = 2874146122247332898L;

	/**
	 * 脱机交易列表
	 */
	@ApiListField("trade_list")
	@ApiField("alipay_offline_trade")
	private List<AlipayOfflineTrade> tradeList;

	public List<AlipayOfflineTrade> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<AlipayOfflineTrade> tradeList) {
		this.tradeList = tradeList;
	}

}
