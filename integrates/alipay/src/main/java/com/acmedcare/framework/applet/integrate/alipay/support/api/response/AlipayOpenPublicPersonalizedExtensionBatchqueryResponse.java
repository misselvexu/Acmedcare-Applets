package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QueryExtension;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicPersonalizedExtensionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7317673675517284677L;

	/** 
	 * 扩展区套数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 扩展区信息
	 */
	@ApiListField("extensions")
	@ApiField("query_extension")
	private List<QueryExtension> extensions;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setExtensions(List<QueryExtension> extensions) {
		this.extensions = extensions;
	}
	public List<QueryExtension> getExtensions( ) {
		return this.extensions;
	}

}
