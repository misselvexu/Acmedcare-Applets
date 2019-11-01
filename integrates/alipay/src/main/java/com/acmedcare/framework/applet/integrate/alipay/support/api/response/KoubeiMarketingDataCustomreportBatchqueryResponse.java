package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CustomReportCondition;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataCustomreportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4388965141288829827L;

	/** 
	 * 分页输出自定义开放数据规则列表
	 */
	@ApiListField("report_condition_list")
	@ApiField("custom_report_condition")
	private List<CustomReportCondition> reportConditionList;

	public void setReportConditionList(List<CustomReportCondition> reportConditionList) {
		this.reportConditionList = reportConditionList;
	}
	public List<CustomReportCondition> getReportConditionList( ) {
		return this.reportConditionList;
	}

}
