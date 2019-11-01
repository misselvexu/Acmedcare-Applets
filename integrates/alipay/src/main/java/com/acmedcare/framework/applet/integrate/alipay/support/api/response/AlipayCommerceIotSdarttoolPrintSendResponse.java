package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sdarttool.print.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 09:49:14
 */
public class AlipayCommerceIotSdarttoolPrintSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8317929117434526522L;

	/** 
	 * 打印任务编号
	 */
	@ApiField("print_no")
	private String printNo;

	public void setPrintNo(String printNo) {
		this.printNo = printNo;
	}
	public String getPrintNo( ) {
		return this.printNo;
	}

}
