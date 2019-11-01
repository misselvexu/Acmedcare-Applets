package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品SKU属性模型
 *
 * @author auto create
 * @since 1.0, 2019-09-11 16:08:43
 */
public class ItemSkuPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 1532792636836116251L;

	/**
	 * 属性
	 */
	@ApiField("property_key")
	private String propertyKey;

	/**
	 * 属性值
	 */
	@ApiField("property_value")
	private String propertyValue;

	public String getPropertyKey() {
		return this.propertyKey;
	}
	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}
