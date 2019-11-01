package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 根据addressId获取用户详细地址信息
 *
 * @author auto create
 * @since 1.0, 2018-05-15 15:52:25
 */
public class AlipayUserAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1623413797668676443L;

	/**
	 * 用户地址唯一ID。通过调用小程序开放api(my.chooseAddress)获取。
	 */
	@ApiField("address_id")
	private String addressId;

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
