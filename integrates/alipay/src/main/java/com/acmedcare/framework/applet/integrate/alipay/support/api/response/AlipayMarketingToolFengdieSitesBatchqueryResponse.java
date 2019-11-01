package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSitesListRespModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:32:03
 */
public class AlipayMarketingToolFengdieSitesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3543213984435788556L;

	/** 
	 * 获取云凤蝶站点列表返回值模型
	 */
	@ApiField("data")
	private FengdieSitesListRespModel data;

	public void setData(FengdieSitesListRespModel data) {
		this.data = data;
	}
	public FengdieSitesListRespModel getData( ) {
		return this.data;
	}

}
