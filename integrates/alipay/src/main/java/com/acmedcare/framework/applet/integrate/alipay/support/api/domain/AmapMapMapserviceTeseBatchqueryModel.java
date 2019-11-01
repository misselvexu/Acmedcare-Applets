package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 高德默认配置
 *
 * @author auto create
 * @since 1.0, 2019-03-05 17:16:44
 */
public class AmapMapMapserviceTeseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2329843684766336212L;

	/**
	 * 2
	 */
	@ApiField("sed")
	private String sed;

	public String getSed() {
		return this.sed;
	}
	public void setSed(String sed) {
		this.sed = sed;
	}

}
