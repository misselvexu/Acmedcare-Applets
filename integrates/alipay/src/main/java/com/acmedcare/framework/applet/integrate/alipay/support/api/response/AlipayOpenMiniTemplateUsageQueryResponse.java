package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TemplateUsageInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.template.usage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-15 22:59:01
 */
public class AlipayOpenMiniTemplateUsageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8224378497887853992L;

	/** 
	 * 小程序appId列表
	 */
	@ApiListField("app_ids")
	@ApiField("string")
	private List<String> appIds;

	/** 
	 * 模板使用信息
	 */
	@ApiListField("template_usage_info_list")
	@ApiField("template_usage_info")
	private List<TemplateUsageInfo> templateUsageInfoList;

	public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}
	public List<String> getAppIds( ) {
		return this.appIds;
	}

	public void setTemplateUsageInfoList(List<TemplateUsageInfo> templateUsageInfoList) {
		this.templateUsageInfoList = templateUsageInfoList;
	}
	public List<TemplateUsageInfo> getTemplateUsageInfoList( ) {
		return this.templateUsageInfoList;
	}

}
