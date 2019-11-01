package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSpaceMemberCreateModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.member.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:28
 */
public class AlipayMarketingToolFengdieMemberCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5654836395388625687L;

	/** 
	 * 凤蝶业务空间创建成功后，返回该成员的基本信息
	 */
	@ApiField("data")
	private FengdieSpaceMemberCreateModel data;

	public void setData(FengdieSpaceMemberCreateModel data) {
		this.data = data;
	}
	public FengdieSpaceMemberCreateModel getData( ) {
		return this.data;
	}

}
