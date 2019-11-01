package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 仪表盘取消授权
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:19
 */
public class AlipayMarketingDataDashboardCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3858515127595693262L;

	/**
	 * 批量取消仪表盘授权
	 */
	@ApiListField("dashboard_ids")
	@ApiField("string")
	private List<String> dashboardIds;

	public List<String> getDashboardIds() {
		return this.dashboardIds;
	}
	public void setDashboardIds(List<String> dashboardIds) {
		this.dashboardIds = dashboardIds;
	}

}
