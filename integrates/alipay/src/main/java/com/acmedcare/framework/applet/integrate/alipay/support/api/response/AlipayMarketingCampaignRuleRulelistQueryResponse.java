package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CrowdRuleInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.rulelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignRuleRulelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7734242326719288122L;

	/** 
	 * [{"ruledesc":"圈人规则0","ruleid":"230291","status":"ENABLE"},
{"ruledesc":"圈人规则1","ruleid":"230292","status":"ENABLE"}]
说明:
ruledesc:规则描述信息
ruleid：规则id（唯一）
status：ENABLE（规则可使用），DISABLE（不可用）
	 */
	@ApiListField("rulelist")
	@ApiField("crowd_rule_info")
	private List<CrowdRuleInfo> rulelist;

	public void setRulelist(List<CrowdRuleInfo> rulelist) {
		this.rulelist = rulelist;
	}
	public List<CrowdRuleInfo> getRulelist( ) {
		return this.rulelist;
	}

}
