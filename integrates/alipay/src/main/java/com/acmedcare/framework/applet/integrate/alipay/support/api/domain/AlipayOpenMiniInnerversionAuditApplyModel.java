package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 多端小程序提交审核
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:08:32
 */
public class AlipayOpenMiniInnerversionAuditApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2321938141819918226L;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序ID
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
