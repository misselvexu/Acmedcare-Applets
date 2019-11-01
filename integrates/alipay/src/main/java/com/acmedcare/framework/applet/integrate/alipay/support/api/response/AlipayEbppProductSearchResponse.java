package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExproductconfResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.product.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppProductSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1363995684895613322L;

	/** 
	 * 产品(学校)模型列表
	 */
	@ApiListField("exproductconfs")
	@ApiField("exproductconf_response")
	private List<ExproductconfResponse> exproductconfs;

	public void setExproductconfs(List<ExproductconfResponse> exproductconfs) {
		this.exproductconfs = exproductconfs;
	}
	public List<ExproductconfResponse> getExproductconfs( ) {
		return this.exproductconfs;
	}

}
