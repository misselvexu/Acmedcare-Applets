package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TradeRecord;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.trade.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:04:01
 */
public class AlipayUserTradeSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4618827793843456348L;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private String totalResults;

	/** 
	 * 交易记录列表
	 */
	@ApiListField("trade_records")
	@ApiField("trade_record")
	private List<TradeRecord> tradeRecords;

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public String getTotalResults( ) {
		return this.totalResults;
	}

	public void setTradeRecords(List<TradeRecord> tradeRecords) {
		this.tradeRecords = tradeRecords;
	}
	public List<TradeRecord> getTradeRecords( ) {
		return this.tradeRecords;
	}

}
