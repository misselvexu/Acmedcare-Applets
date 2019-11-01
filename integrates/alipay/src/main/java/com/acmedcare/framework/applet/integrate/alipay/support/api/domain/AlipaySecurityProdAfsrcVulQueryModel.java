package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 漏洞详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:58
 */
public class AlipaySecurityProdAfsrcVulQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4357949731844447765L;

	/**
	 * 漏洞id
	 */
	@ApiField("vul_id")
	private Long vulId;

	public Long getVulId() {
		return this.vulId;
	}
	public void setVulId(Long vulId) {
		this.vulId = vulId;
	}

}
