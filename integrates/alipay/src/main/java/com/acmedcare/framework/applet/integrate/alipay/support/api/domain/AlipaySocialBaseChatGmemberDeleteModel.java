package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 支付宝社交剔除群成员
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:17
 */
public class AlipaySocialBaseChatGmemberDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3861473559262511687L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 剔除的群成员用户id列表
	 */
	@ApiListField("uids")
	@ApiField("string")
	private List<String> uids;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<String> getUids() {
		return this.uids;
	}
	public void setUids(List<String> uids) {
		this.uids = uids;
	}

}
