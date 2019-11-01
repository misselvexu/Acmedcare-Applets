package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 预发确认
 *
 * @author auto create
 * @since 1.0, 2019-09-19 21:12:04
 */
public class AlipayOpenMiniInnerversionPreonlineConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5745766118466861651L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序Id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
