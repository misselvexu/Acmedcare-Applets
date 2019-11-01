package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询是否开通森林
 *
 * @author auto create
 * @since 1.0, 2018-07-13 16:52:14
 */
public class AlipayUserCharityForestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7365658886633274782L;

	/**
	 * 用户的支付宝账户ID
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
