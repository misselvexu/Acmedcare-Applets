package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicPersonalizedMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7751325763669611234L;

	/** 
	 * 该套个性化菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
