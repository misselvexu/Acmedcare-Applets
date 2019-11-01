package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 钢铁匣查询准入条件
 *
 * @author auto create
 * @since 1.0, 2018-12-21 15:10:32
 */
public class AlipayUserSafeboxConditionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6689346416829216469L;

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
