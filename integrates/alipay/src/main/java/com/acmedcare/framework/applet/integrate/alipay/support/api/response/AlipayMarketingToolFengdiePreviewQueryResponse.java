package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdiePreviewQueryRespModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.preview.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingToolFengdiePreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5129363749286659265L;

	/** 
	 * 站点页面预览数据返回值
	 */
	@ApiField("data")
	private FengdiePreviewQueryRespModel data;

	public void setData(FengdiePreviewQueryRespModel data) {
		this.data = data;
	}
	public FengdiePreviewQueryRespModel getData( ) {
		return this.data;
	}

}
