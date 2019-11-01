package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 零七二五
 *
 * @author auto create
 * @since 1.0, 2017-07-25 08:39:52
 */
public class AlipayOpenAppLingqierwuLingqierquQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2377796698671898126L;

	/**
	 * 12
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	public List<String> getTest() {
		return this.test;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}

}
