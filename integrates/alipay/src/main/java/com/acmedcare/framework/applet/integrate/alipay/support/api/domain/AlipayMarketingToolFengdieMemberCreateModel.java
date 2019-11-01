package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶空间成员
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:28
 */
public class AlipayMarketingToolFengdieMemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5533943151224618899L;

	/**
	 * 用户的昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 空间管理员，可由 vip 账户代替，值为vip账号或该空间管理员的 origin_user_id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲创建的空间成员所关联的第三方用户ID，由调用方保持其唯一性
	 */
	@ApiField("origin_user_id")
	private String originUserId;

	/**
	 * 欲创建成员的空间ID
	 */
	@ApiField("space_id")
	private String spaceId;

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOriginUserId() {
		return this.originUserId;
	}
	public void setOriginUserId(String originUserId) {
		this.originUserId = originUserId;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
