package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 2133
 *
 * @author auto create
 * @since 1.0, 2019-09-21 14:29:35
 */
public class AlipaySecurityProdDfesfDefBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4347957751642445747L;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
