package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * K-V对象
 *
 * @author auto create
 * @since 1.0, 2019-09-04 11:39:08
 */
public class Pair extends AlipayObject {

	private static final long serialVersionUID = 3421642838644426162L;

	/**
	 * KEY
	 */
	@ApiField("key")
	private String key;

	/**
	 * value
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
