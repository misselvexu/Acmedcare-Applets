package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商圈地址查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:33
 */
public class KoubeiShopMallPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4828348232648331311L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
