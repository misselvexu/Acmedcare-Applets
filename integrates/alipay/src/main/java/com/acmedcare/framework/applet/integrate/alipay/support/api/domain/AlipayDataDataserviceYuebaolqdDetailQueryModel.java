package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 余额宝负债端预测数据
 *
 * @author auto create
 * @since 1.0, 2019-08-13 16:29:24
 */
public class AlipayDataDataserviceYuebaolqdDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4371734244257727368L;

	/**
	 * 服务入参，格式为yyyymmdd
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
