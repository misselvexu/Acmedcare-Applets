package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 扫脸信息查询
 *
 * @author auto create
 * @since 1.0, 2019-02-18 14:56:35
 */
public class AlipayCommerceEducateSignTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4435563765978263444L;

	/**
	 * 加密TOKEN
	 */
	@ApiField("token_key")
	private String tokenKey;

	public String getTokenKey() {
		return this.tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

}
