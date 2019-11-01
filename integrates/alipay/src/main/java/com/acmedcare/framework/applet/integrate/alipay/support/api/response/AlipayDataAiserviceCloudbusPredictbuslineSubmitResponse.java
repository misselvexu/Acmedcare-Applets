package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CloudbusSubmitPredictItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.predictbusline.submit response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-22 10:28:03
 */
public class AlipayDataAiserviceCloudbusPredictbuslineSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1829878279661744769L;

	/** 
	 * 预测任务提交返回
	 */
	@ApiField("result")
	private CloudbusSubmitPredictItem result;

	public void setResult(CloudbusSubmitPredictItem result) {
		this.result = result;
	}
	public CloudbusSubmitPredictItem getResult( ) {
		return this.result;
	}

}
