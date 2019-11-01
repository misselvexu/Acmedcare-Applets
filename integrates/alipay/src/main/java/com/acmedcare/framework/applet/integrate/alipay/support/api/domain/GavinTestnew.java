package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2019-06-05 19:46:49
 */
public class GavinTestnew extends AlipayObject {

	private static final long serialVersionUID = 1269877992388135418L;

	/**
	 * 测试
	 */
	@ApiField("test")
	private String test;

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
