package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 券查询
 *
 * @author auto create
 * @since 1.0, 2019-03-11 14:28:39
 */
public class AlipayMarketingVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5253617932624431285L;

	/**
	 * 券ID(券唯一标识, 发券接口返回参数)
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
