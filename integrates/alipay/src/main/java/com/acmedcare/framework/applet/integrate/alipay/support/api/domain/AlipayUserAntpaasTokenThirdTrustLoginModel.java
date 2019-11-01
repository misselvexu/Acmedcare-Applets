package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 申请第三方app与蚂蚁通行证免登token
 *
 * @author auto create
 * @since 1.0, 2016-10-14 16:41:55
 */
public class AlipayUserAntpaasTokenThirdTrustLoginModel extends AlipayObject {

	private static final long serialVersionUID = 6688168779375629535L;

	/**
	 * 登录的目标业务，目前已经分配的有autoins，代表车险业务
	 */
	@ApiField("login_target")
	private String loginTarget;

	public String getLoginTarget() {
		return this.loginTarget;
	}
	public void setLoginTarget(String loginTarget) {
		this.loginTarget = loginTarget;
	}

}
