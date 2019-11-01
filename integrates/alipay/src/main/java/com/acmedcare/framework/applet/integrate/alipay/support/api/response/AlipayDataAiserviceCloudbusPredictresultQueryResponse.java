package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CloudbusPredictResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.predictresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-23 14:22:58
 */
public class AlipayDataAiserviceCloudbusPredictresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8438768216551596464L;

	/** 
	 * 预测线路结果
	 */
	@ApiField("result")
	private CloudbusPredictResult result;

	public void setResult(CloudbusPredictResult result) {
		this.result = result;
	}
	public CloudbusPredictResult getResult( ) {
		return this.result;
	}

}
