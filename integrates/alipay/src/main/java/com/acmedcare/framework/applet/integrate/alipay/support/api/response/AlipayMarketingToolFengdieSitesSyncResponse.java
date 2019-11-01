package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSuccessRespModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:49
 */
public class AlipayMarketingToolFengdieSitesSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6751529375838535881L;

	/** 
	 * 返回站点升级是否成功
	 */
	@ApiField("data")
	private FengdieSuccessRespModel data;

	public void setData(FengdieSuccessRespModel data) {
		this.data = data;
	}
	public FengdieSuccessRespModel getData( ) {
		return this.data;
	}

}
