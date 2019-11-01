package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MiniAppBaseInfoQueryResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-09 11:30:38
 */
public class AlipayOpenMiniInnerbaseinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2493572995879761454L;

	/** 
	 * 小程序基本信息
	 */
	@ApiListField("base_info_list")
	@ApiField("mini_app_base_info_query_response")
	private List<MiniAppBaseInfoQueryResponse> baseInfoList;

	public void setBaseInfoList(List<MiniAppBaseInfoQueryResponse> baseInfoList) {
		this.baseInfoList = baseInfoList;
	}
	public List<MiniAppBaseInfoQueryResponse> getBaseInfoList( ) {
		return this.baseInfoList;
	}

}
