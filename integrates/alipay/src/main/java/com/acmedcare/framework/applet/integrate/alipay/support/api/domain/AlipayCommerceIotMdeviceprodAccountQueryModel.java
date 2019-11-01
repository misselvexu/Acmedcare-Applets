package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询脱敏支付宝账号信息
 *
 * @author auto create
 * @since 1.0, 2019-09-16 16:58:04
 */
public class AlipayCommerceIotMdeviceprodAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4164187765161892547L;

	/**
	 * 登录ID，需要跟登录类别（logon_type，EMAIL:邮箱登陆 MOBILE:手机登录）结合
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
