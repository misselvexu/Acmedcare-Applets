package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 签约校验信息
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:31:50
 */
public class VerifyParams extends AlipayObject {

	private static final long serialVersionUID = 3481195163593553924L;

	/**
	 * 用户证件号后4位
	 */
	@ApiField("cert_no")
	private String certNo;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
