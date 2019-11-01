package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BaseLoanApplyVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanLoanInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3519156662249365998L;

	/** 
	 * 贷款记录列表
	 */
	@ApiListField("base_apply_list")
	@ApiField("base_loan_apply_v_o")
	private List<BaseLoanApplyVO> baseApplyList;

	/** 
	 * 结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setBaseApplyList(List<BaseLoanApplyVO> baseApplyList) {
		this.baseApplyList = baseApplyList;
	}
	public List<BaseLoanApplyVO> getBaseApplyList( ) {
		return this.baseApplyList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
