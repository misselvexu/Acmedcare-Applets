package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 支付宝社交查询群信息
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:47
 */
public class AlipaySocialBaseChatGinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6154558559643893339L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
