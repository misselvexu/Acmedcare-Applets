package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSuccessRespModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.delete response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:43
 */
public class AlipayMarketingToolFengdieSitesDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5579976293821162474L;

	/** 
	 * 返回删除云凤蝶站点成功与失败的结果
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
