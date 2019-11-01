package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询模板详情
 *
 * @author auto create
 * @since 1.0, 2019-06-28 21:53:12
 */
public class AlipayMarketingVoucherTemplatedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5381753659879215136L;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
