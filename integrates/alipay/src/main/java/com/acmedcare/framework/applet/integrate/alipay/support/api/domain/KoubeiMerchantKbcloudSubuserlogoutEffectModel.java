package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑子账号登出
 *
 * @author auto create
 * @since 1.0, 2018-11-19 18:09:20
 */
public class KoubeiMerchantKbcloudSubuserlogoutEffectModel extends AlipayObject {

	private static final long serialVersionUID = 3527764233868886339L;

	/**
	 * 登录的sessionId
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
