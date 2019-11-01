package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.detect.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-02 15:25:00
 */
public class AlipayEbppDetectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1683489525457161776L;

	/** 
	 * 外部业务标识，同入参的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
