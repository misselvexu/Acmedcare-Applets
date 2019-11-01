package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 被邀请者淘宝端转化同步
 *
 * @author auto create
 * @since 1.0, 2019-09-18 21:53:38
 */
public class AlipayUserAccountInvitedConvertSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7271354254432256528L;

	/**
	 * 转化标签
	 */
	@ApiField("convert_tag")
	private String convertTag;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getConvertTag() {
		return this.convertTag;
	}
	public void setConvertTag(String convertTag) {
		this.convertTag = convertTag;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
