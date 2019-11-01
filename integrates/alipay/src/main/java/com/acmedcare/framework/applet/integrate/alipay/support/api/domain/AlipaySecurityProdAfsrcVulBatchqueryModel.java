package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 白帽子漏洞批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:44
 */
public class AlipaySecurityProdAfsrcVulBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5737378233323657599L;

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
