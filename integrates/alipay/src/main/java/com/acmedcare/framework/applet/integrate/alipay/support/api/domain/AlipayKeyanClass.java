package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ceshi moxing
 *
 * @author auto create
 * @since 1.0, 2017-08-01 16:05:41
 */
public class AlipayKeyanClass extends AlipayObject {

	private static final long serialVersionUID = 7381944136176933482L;

	/**
	 * 1
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
