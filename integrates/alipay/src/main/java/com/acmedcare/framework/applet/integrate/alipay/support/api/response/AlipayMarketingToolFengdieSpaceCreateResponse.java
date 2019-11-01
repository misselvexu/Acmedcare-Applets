package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSpaceDetailModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.space.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:07
 */
public class AlipayMarketingToolFengdieSpaceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2563356388643657642L;

	/** 
	 * 创建成功后返回空间的基本信息，包含空间 ID、标题、创建时间与可用域名列表
	 */
	@ApiField("data")
	private FengdieSpaceDetailModel data;

	public void setData(FengdieSpaceDetailModel data) {
		this.data = data;
	}
	public FengdieSpaceDetailModel getData( ) {
		return this.data;
	}

}
