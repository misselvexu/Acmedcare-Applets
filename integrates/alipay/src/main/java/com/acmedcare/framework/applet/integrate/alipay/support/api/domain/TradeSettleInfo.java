package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 交易结算相关信息。包含分账、补差等信息
 *
 * @author auto create
 * @since 1.0, 2019-06-05 09:21:57
 */
public class TradeSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 5193812328893673723L;

	/**
	 * 交易结算明细信息
	 */
	@ApiListField("trade_settle_detail_list")
	@ApiField("trade_settle_detail")
	private List<TradeSettleDetail> tradeSettleDetailList;

	public List<TradeSettleDetail> getTradeSettleDetailList() {
		return this.tradeSettleDetailList;
	}
	public void setTradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
		this.tradeSettleDetailList = tradeSettleDetailList;
	}

}
