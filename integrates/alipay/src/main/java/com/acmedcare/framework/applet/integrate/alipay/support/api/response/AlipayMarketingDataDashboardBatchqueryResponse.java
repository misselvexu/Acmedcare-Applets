package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DashBoardMeta;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingDataDashboardBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3112572459488697286L;

	/** 
	 * 仪表盘列表信息
	 */
	@ApiListField("dashboard_list")
	@ApiField("dash_board_meta")
	private List<DashBoardMeta> dashboardList;

	/** 
	 * 报表总页数
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

	public void setDashboardList(List<DashBoardMeta> dashboardList) {
		this.dashboardList = dashboardList;
	}
	public List<DashBoardMeta> getDashboardList( ) {
		return this.dashboardList;
	}

	public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
