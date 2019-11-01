package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商圈会员识别
 *
 * @author auto create
 * @since 1.0, 2018-06-19 15:49:06
 */
public class KoubeiShopMallMemberIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2573282984987767923L;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
