package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1261393973159895215L;

	/** 
	 * 生成的带参推广短链接
	 */
	@ApiField("shortlink")
	private String shortlink;

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
