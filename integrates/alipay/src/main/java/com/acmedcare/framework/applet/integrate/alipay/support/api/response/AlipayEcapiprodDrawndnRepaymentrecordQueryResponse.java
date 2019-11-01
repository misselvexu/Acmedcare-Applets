package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.RepaymentRecords;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.repaymentrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcapiprodDrawndnRepaymentrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3875394646845266562L;

	/** 
	 * 还款流水
	 */
	@ApiListField("repayment_records")
	@ApiField("repayment_records")
	private List<RepaymentRecords> repaymentRecords;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRepaymentRecords(List<RepaymentRecords> repaymentRecords) {
		this.repaymentRecords = repaymentRecords;
	}
	public List<RepaymentRecords> getRepaymentRecords( ) {
		return this.repaymentRecords;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
