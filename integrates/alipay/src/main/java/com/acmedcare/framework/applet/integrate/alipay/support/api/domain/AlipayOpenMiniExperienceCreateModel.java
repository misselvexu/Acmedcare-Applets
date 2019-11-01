package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序生成体验版
 *
 * @author auto create
 * @since 1.0, 2019-09-04 17:40:09
 */
public class AlipayOpenMiniExperienceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4683816179826189889L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
