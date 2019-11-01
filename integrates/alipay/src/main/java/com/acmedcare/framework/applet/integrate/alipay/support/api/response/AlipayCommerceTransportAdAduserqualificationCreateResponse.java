package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.aduserqualification.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdAduserqualificationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1866929332133225616L;

	/** 
	 * 资质id+ 用户资质id，唯一标识用户的创建的一个资质
	 */
	@ApiField("qualification_id")
	private Long qualificationId;

	public void setQualificationId(Long qualificationId) {
		this.qualificationId = qualificationId;
	}
	public Long getQualificationId( ) {
		return this.qualificationId;
	}

}
