package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MultiAppBaseInfoDto;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appinfo.multi.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-11 10:55:00
 */
public class AlipayOpenMiniAppinfoMultiBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4396579279868134347L;

	/** 
	 * 多端应用信息
	 */
	@ApiListField("app_base_info_list")
	@ApiField("multi_app_base_info_dto")
	private List<MultiAppBaseInfoDto> appBaseInfoList;

	public void setAppBaseInfoList(List<MultiAppBaseInfoDto> appBaseInfoList) {
		this.appBaseInfoList = appBaseInfoList;
	}
	public List<MultiAppBaseInfoDto> getAppBaseInfoList( ) {
		return this.appBaseInfoList;
	}

}
