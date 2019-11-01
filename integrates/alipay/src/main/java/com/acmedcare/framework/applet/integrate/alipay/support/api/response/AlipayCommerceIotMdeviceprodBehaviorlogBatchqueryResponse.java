package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DeviceBehaviorLogResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.behaviorlog.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:52:03
 */
public class AlipayCommerceIotMdeviceprodBehaviorlogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5752845787238248642L;

	/** 
	 * 日志关联的设备信息
	 */
	@ApiListField("result_list")
	@ApiField("device_behavior_log_response")
	private List<DeviceBehaviorLogResponse> resultList;

	public void setResultList(List<DeviceBehaviorLogResponse> resultList) {
		this.resultList = resultList;
	}
	public List<DeviceBehaviorLogResponse> getResultList( ) {
		return this.resultList;
	}

}
