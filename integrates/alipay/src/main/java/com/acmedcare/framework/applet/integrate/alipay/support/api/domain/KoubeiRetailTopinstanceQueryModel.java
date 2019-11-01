package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 快消行业 店铺页面已经置顶券和DM查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-27 18:08:19
 */
public class KoubeiRetailTopinstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7465689488686999818L;

	/**
	 * 券或者电子DM单（VOUCHER、DM）
	 */
	@ApiField("instance_type")
	private String instanceType;

	public String getInstanceType() {
		return this.instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

}
