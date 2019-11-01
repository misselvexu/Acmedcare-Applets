package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieActivityCreateModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:32:23
 */
public class AlipayMarketingToolFengdieSitesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3189717679571497369L;

	/** 
	 * 创建站点的返回值模型
	 */
	@ApiField("data")
	private FengdieActivityCreateModel data;

	public void setData(FengdieActivityCreateModel data) {
		this.data = data;
	}
	public FengdieActivityCreateModel getData( ) {
		return this.data;
	}

}
