package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ddd
 *
 * @author auto create
 * @since 1.0, 2018-08-08 21:56:22
 */
public class MyObjectDdd extends AlipayObject {

	private static final long serialVersionUID = 1179738389143823195L;

	/**
	 * xx
	 */
	@ApiField("item")
	private String item;

	/**
	 * xxx
	 */
	@ApiField("param")
	private String param;

	public String getItem() {
		return this.item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

}
