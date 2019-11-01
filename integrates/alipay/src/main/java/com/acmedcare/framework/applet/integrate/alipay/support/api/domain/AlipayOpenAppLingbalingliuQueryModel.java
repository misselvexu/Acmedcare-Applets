package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * yufayanzheng
 *
 * @author auto create
 * @since 1.0, 2018-08-16 12:02:08
 */
public class AlipayOpenAppLingbalingliuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2612192944476128519L;

	/**
	 * 12
	 */
	@ApiField("canshu")
	private String canshu;

	public String getCanshu() {
		return this.canshu;
	}
	public void setCanshu(String canshu) {
		this.canshu = canshu;
	}

}
