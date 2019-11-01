package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 测试数据
 *
 * @author auto create
 * @since 1.0, 2019-06-05 19:47:23
 */
public class AlipaySecurityProdDesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4815195515434519334L;

	/**
	 * 121
	 */
	@ApiField("com")
	private GavinTestnew com;

	/**
	 * 1
	 */
	@ApiListField("test")
	@ApiField("string")
	private List<String> test;

	public GavinTestnew getCom() {
		return this.com;
	}
	public void setCom(GavinTestnew com) {
		this.com = com;
	}

	public List<String> getTest() {
		return this.test;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}

}
