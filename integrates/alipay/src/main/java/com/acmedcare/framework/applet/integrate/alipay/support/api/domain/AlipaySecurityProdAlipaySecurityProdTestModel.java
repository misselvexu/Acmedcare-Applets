package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 安全业务操作
 *
 * @author auto create
 * @since 1.0, 2016-03-02 10:47:05
 */
public class AlipaySecurityProdAlipaySecurityProdTestModel extends AlipayObject {

	private static final long serialVersionUID = 8683892718314919921L;

	/**
	 * ddd
	 */
	@ApiListField("cds")
	@ApiField("string")
	private List<String> cds;

	/**
	 * aaa
	 */
	@ApiField("ddd")
	private String ddd;

	public List<String> getCds() {
		return this.cds;
	}
	public void setCds(List<String> cds) {
		this.cds = cds;
	}

	public String getDdd() {
		return this.ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
