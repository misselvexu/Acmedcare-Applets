package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 打发的发顺丰
 *
 * @author auto create
 * @since 1.0, 2019-07-11 15:57:19
 */
public class AlipaySecurityAafAdfaBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2746167262812825466L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
