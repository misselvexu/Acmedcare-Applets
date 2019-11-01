package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.Gavinmed;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.repro.ces.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-05 11:00:01
 */
public class AlipayOpenAppReproCesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2573372343171879613L;

	/** 
	 * 21
	 */
	@ApiListField("resname")
	@ApiField("gavinmed")
	private List<Gavinmed> resname;

	/** 
	 * 21
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

	public void setResname(List<Gavinmed> resname) {
		this.resname = resname;
	}
	public List<Gavinmed> getResname( ) {
		return this.resname;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
		return this.result;
	}

}
