package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 支付宝账号入驻开放平台有效性检查
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:07:28
 */
public class AlipayOpenAppDeveloperCheckdevelopervalidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7688148912346478783L;

	/**
	 * 支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
