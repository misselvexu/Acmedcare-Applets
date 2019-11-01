package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 圈人规则详情查询
 *
 * @author auto create
 * @since 1.0, 2018-10-17 14:07:17
 */
public class AlipayMarketingCampaignRuleCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5222451141634567839L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 所要查询的规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

	public String getRuleid() {
		return this.ruleid;
	}
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

}
