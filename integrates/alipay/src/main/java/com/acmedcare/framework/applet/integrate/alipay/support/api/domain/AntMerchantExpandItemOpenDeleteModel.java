package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 删除商品接口
 *
 * @author auto create
 * @since 1.0, 2019-09-17 10:54:27
 */
public class AntMerchantExpandItemOpenDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5887213261811133197L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
