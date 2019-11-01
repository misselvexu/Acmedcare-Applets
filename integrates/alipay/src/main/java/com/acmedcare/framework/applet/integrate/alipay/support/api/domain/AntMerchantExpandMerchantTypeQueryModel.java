package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 间连绑定类型查询
 *
 * @author auto create
 * @since 1.0, 2019-08-26 10:49:01
 */
public class AntMerchantExpandMerchantTypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8219282143329283944L;

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
