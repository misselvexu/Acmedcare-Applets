package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 会员模板批量查询
 *
 * @author auto create
 * @since 1.0, 2018-11-30 15:37:16
 */
public class KoubeiMarketingCampaignMemberTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6249163428664182345L;

	/**
	 * 会员模板id
	 */
	@ApiListField("member_template_ids")
	@ApiField("string")
	private List<String> memberTemplateIds;

	public List<String> getMemberTemplateIds() {
		return this.memberTemplateIds;
	}
	public void setMemberTemplateIds(List<String> memberTemplateIds) {
		this.memberTemplateIds = memberTemplateIds;
	}

}
