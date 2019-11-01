package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序预创建确认生成
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:25:42
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1693113638953325758L;

	/**
	 * 小程序ID
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
