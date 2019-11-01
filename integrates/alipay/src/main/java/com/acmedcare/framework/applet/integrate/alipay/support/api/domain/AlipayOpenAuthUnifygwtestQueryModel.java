package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 21
 *
 * @author auto create
 * @since 1.0, 2019-03-08 11:08:54
 */
public class AlipayOpenAuthUnifygwtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2763456256792535611L;

	/**
	 * 1
	 */
	@ApiField("str")
	private String str;

	public String getStr() {
		return this.str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
