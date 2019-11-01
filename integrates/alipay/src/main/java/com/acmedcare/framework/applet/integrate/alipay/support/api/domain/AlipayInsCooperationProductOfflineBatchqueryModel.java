package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * （快捷投保）查询该保险公司的线下产品列表
 *
 * @author auto create
 * @since 1.0, 2017-10-24 10:29:35
 */
public class AlipayInsCooperationProductOfflineBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4121472276163574395L;

	/**
	 * 机构在蚂蚁平台上的惟一标识
	 */
	@ApiField("inst_id")
	private String instId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
