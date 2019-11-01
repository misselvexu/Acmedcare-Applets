package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 开放基础业务模拟查询接口
 *
 * @author auto create
 * @since 1.0, 2019-01-17 16:36:43
 */
public class AlipayOpenOperationOpenbizmockBizQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2325264943346392784L;

	/**
	 * 业务编码
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
