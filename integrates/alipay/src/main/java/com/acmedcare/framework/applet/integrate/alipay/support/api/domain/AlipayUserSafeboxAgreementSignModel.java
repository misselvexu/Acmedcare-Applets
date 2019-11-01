package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 钢铁匣签约
 *
 * @author auto create
 * @since 1.0, 2018-12-21 15:10:37
 */
public class AlipayUserSafeboxAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 6583735983762728692L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
