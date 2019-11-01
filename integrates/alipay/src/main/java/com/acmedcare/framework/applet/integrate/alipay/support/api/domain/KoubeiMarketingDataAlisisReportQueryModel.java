package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 报表详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:41:08
 */
public class KoubeiMarketingDataAlisisReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3557424715513656458L;

	/**
	 * 报表查询过滤条件
	 */
	@ApiListField("conditions")
	@ApiField("report_query_condition")
	private List<ReportQueryCondition> conditions;

	/**
	 * 报表唯一标识
	 */
	@ApiField("report_uk")
	private String reportUk;

	public List<ReportQueryCondition> getConditions() {
		return this.conditions;
	}
	public void setConditions(List<ReportQueryCondition> conditions) {
		this.conditions = conditions;
	}

	public String getReportUk() {
		return this.reportUk;
	}
	public void setReportUk(String reportUk) {
		this.reportUk = reportUk;
	}

}
