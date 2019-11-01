package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2019-04-11 17:38:22
 */
public class Gavintest extends AlipayObject {

	private static final long serialVersionUID = 3677536921684554481L;

	/**
	 * 测试
	 */
	@ApiField("newid")
	private Long newid;

	public Long getNewid() {
		return this.newid;
	}
	public void setNewid(Long newid) {
		this.newid = newid;
	}

}
