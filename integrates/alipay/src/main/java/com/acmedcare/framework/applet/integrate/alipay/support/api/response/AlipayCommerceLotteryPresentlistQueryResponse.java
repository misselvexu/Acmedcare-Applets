package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.LotteryPresent;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.presentlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceLotteryPresentlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7177693456262855749L;

	/** 
	 * 列表内容
	 */
	@ApiListField("results")
	@ApiField("lottery_present")
	private List<LotteryPresent> results;

	/** 
	 * 返回的列表的大小
	 */
	@ApiField("total_result")
	private Long totalResult;

	public void setResults(List<LotteryPresent> results) {
		this.results = results;
	}
	public List<LotteryPresent> getResults( ) {
		return this.results;
	}

	public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}
	public Long getTotalResult( ) {
		return this.totalResult;
	}

}
