package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 离线变量查询
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:52
 */
public class SsdataDataserviceRiskOfflinevarsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1672669976898359939L;

	/**
	 * 查询离线变量的主键
	 */
	@ApiField("rowkeys")
	private String rowkeys;

	public String getRowkeys() {
		return this.rowkeys;
	}
	public void setRowkeys(String rowkeys) {
		this.rowkeys = rowkeys;
	}

}
