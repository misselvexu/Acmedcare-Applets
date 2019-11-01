package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OfflineInviteNewerSummaryInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.offlinesummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-22 10:50:35
 */
public class AlipayUserInviteOfflinesummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1624127516287577341L;

	/** 
	 * 线下拉新结算汇总数据列表
	 */
	@ApiListField("offline_summary_info_list")
	@ApiField("offline_invite_newer_summary_info")
	private List<OfflineInviteNewerSummaryInfo> offlineSummaryInfoList;

	public void setOfflineSummaryInfoList(List<OfflineInviteNewerSummaryInfo> offlineSummaryInfoList) {
		this.offlineSummaryInfoList = offlineSummaryInfoList;
	}
	public List<OfflineInviteNewerSummaryInfo> getOfflineSummaryInfoList( ) {
		return this.offlineSummaryInfoList;
	}

}
