package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 仪表盘查询
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:38
 */
public class AlipayMarketingDataDashboardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6172276746772544385L;

	/**
	 * 仪表盘ID
	 */
	@ApiField("dashboard_id")
	private String dashboardId;

	/**
	 * 仪表盘过滤条件
	 */
	@ApiListField("param")
	@ApiField("dashboard_param")
	private List<DashboardParam> param;

	public String getDashboardId() {
		return this.dashboardId;
	}
	public void setDashboardId(String dashboardId) {
		this.dashboardId = dashboardId;
	}

	public List<DashboardParam> getParam() {
		return this.param;
	}
	public void setParam(List<DashboardParam> param) {
		this.param = param;
	}

}
