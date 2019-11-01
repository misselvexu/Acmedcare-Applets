package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 店铺扩展信息，key-value键值对
 *
 * @author auto create
 * @since 1.0, 2019-02-25 21:43:24
 */
public class ShopExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6686676811569724852L;

	/**
	 * KV数据对的key，表示该kv对象表示什么含义。
	 */
	@ApiField("key_name")
	private String keyName;

	/**
	 * kv对象的值
	 */
	@ApiField("value")
	private String value;

	public String getKeyName() {
		return this.keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
