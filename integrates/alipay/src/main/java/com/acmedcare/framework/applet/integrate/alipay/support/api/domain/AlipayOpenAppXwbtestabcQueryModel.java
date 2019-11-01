package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * xuweibo测试用
 *
 * @author auto create
 * @since 1.0, 2017-12-01 10:47:07
 */
public class AlipayOpenAppXwbtestabcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2695861595369172135L;

	/**
	 * 1
	 */
	@ApiField("testabc")
	private String testabc;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getTestabc() {
		return this.testabc;
	}
	public void setTestabc(String testabc) {
		this.testabc = testabc;
	}

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
