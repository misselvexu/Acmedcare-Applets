package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DataSendBusinessResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-25 14:08:20
 */
public class AlipayCommerceDataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2815351298915795921L;

	/** 
	 * data_send_business_result:数据发送业务处理结果信息
	 */
	@ApiField("data_send_business_result")
	private DataSendBusinessResult dataSendBusinessResult;

	public void setDataSendBusinessResult(DataSendBusinessResult dataSendBusinessResult) {
		this.dataSendBusinessResult = dataSendBusinessResult;
	}
	public DataSendBusinessResult getDataSendBusinessResult( ) {
		return this.dataSendBusinessResult;
	}

}
