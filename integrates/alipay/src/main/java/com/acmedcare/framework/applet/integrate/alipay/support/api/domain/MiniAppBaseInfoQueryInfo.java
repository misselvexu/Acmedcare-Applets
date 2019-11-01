package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 批量查询小程序信息
 *
 * @author auto create
 * @since 1.0, 2019-05-09 11:30:28
 */
public class MiniAppBaseInfoQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 7239695191548795584L;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
