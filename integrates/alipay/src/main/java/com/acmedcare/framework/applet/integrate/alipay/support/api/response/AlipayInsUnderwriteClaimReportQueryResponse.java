package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsClaimReport;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.claim.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsUnderwriteClaimReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8822518799571777597L;

	/** 
	 * 案件信息
	 */
	@ApiListField("reports")
	@ApiField("ins_claim_report")
	private List<InsClaimReport> reports;

	public void setReports(List<InsClaimReport> reports) {
		this.reports = reports;
	}
	public List<InsClaimReport> getReports( ) {
		return this.reports;
	}

}
