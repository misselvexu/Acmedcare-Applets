package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.VulList;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdAfsrcVulBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2682897634665195458L;

	/** 
	 * 漏洞信息列表
	 */
	@ApiListField("data")
	@ApiField("vul_list")
	private List<VulList> data;

	public void setData(List<VulList> data) {
		this.data = data;
	}
	public List<VulList> getData( ) {
		return this.data;
	}

}
