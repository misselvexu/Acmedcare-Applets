package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSitesQueryRespModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:00
 */
public class AlipayMarketingToolFengdieSitesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4579475571816593273L;

	/** 
	 * 站点查询返回值
	 */
	@ApiField("data")
	private FengdieSitesQueryRespModel data;

	public void setData(FengdieSitesQueryRespModel data) {
		this.data = data;
	}
	public FengdieSitesQueryRespModel getData( ) {
		return this.data;
	}

}
