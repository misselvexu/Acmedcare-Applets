package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ka基础信息获取
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:07
 */
public class AlipayEcoRenthouseKaBaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1677894945669298688L;

	/**
	 * kaCode唯一标识
	 */
	@ApiField("ka_code")
	private String kaCode;

	public String getKaCode() {
		return this.kaCode;
	}
	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}

}
