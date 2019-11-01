package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SupportFunction;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.function.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceCityfacilitatorFunctionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8173485682264312839L;

	/** 
	 * 支持的功能列表
	 */
	@ApiListField("functions")
	@ApiField("support_function")
	private List<SupportFunction> functions;

	public void setFunctions(List<SupportFunction> functions) {
		this.functions = functions;
	}
	public List<SupportFunction> getFunctions( ) {
		return this.functions;
	}

}
