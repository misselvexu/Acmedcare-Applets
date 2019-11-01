package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ArrangementOpenQueryResultVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.arrangement.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditLoanapplyArrangementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2777159171184771576L;

	/** 
	 * 查询指定客户、产品下客户签订的合约状态等信息
	 */
	@ApiListField("arrangement_query_result")
	@ApiField("arrangement_open_query_result_v_o")
	private List<ArrangementOpenQueryResultVO> arrangementQueryResult;

	public void setArrangementQueryResult(List<ArrangementOpenQueryResultVO> arrangementQueryResult) {
		this.arrangementQueryResult = arrangementQueryResult;
	}
	public List<ArrangementOpenQueryResultVO> getArrangementQueryResult( ) {
		return this.arrangementQueryResult;
	}

}
