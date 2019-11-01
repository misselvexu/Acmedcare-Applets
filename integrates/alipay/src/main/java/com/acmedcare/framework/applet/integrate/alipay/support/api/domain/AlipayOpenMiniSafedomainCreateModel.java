package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序添加域白名单
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:16:22
 */
public class AlipayOpenMiniSafedomainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5163166311776286964L;

	/**
	 * httpRequest域白名单
	 */
	@ApiField("safe_domain")
	private String safeDomain;

	public String getSafeDomain() {
		return this.safeDomain;
	}
	public void setSafeDomain(String safeDomain) {
		this.safeDomain = safeDomain;
	}

}
