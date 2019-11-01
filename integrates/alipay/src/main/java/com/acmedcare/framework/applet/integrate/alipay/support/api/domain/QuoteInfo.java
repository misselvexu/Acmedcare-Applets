package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 报价信息
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:04:26
 */
public class QuoteInfo extends AlipayObject {

	private static final long serialVersionUID = 6722915692292176166L;

	/**
	 * 238810000000049704774
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getQuoteBizId() {
		return this.quoteBizId;
	}
	public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

}
