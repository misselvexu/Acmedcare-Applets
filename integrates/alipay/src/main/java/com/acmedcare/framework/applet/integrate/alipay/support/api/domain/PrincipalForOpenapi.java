package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 作者model
 *
 * @author auto create
 * @since 1.0, 2019-03-08 11:47:07
 */
public class PrincipalForOpenapi extends AlipayObject {

	private static final long serialVersionUID = 1681726322677883843L;

	/**
	 * 用户id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用户类型
	 */
	@ApiField("principal_type")
	private String principalType;

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
