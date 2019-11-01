package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.GavintestNewLeveaOne;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.releastst.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-11 17:22:28
 */
public class AlipayOpenMiniReleaststBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5259646496721872781L;

	/** 
	 * 21
	 */
	@ApiField("des")
	private GavintestNewLeveaOne des;

	/** 
	 * 10
	 */
	@ApiField("out")
	private String out;

	public void setDes(GavintestNewLeveaOne des) {
		this.des = des;
	}
	public GavintestNewLeveaOne getDes( ) {
		return this.des;
	}

	public void setOut(String out) {
		this.out = out;
	}
	public String getOut( ) {
		return this.out;
	}

}
