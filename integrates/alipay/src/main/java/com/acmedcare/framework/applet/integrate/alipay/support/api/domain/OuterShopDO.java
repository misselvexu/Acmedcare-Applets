package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 操作的店铺对象信息
 *
 * @author auto create
 * @since 1.0, 2017-03-07 22:15:22
 */
public class OuterShopDO extends AlipayObject {

	private static final long serialVersionUID = 3576412871631835675L;

	/**
	 * 合作商户ID
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 支付宝店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 合作商户类型 （mike、_2dFire）
iSV自己定义自己的类型，推荐使用自己的域名
	 */
	@ApiField("type")
	private String type;

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
