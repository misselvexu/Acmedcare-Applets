package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序预创建取消
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:26:32
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2434543653274851543L;

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
