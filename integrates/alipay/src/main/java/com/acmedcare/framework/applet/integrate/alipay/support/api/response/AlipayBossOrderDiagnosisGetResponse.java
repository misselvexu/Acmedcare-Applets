package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DiagnosisInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.order.diagnosis.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-16 15:20:01
 */
public class AlipayBossOrderDiagnosisGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5288177444539874427L;

	/** 
	 * 诊断模型
	 */
	@ApiListField("diagnosis_result")
	@ApiField("diagnosis_info")
	private List<DiagnosisInfo> diagnosisResult;

	public void setDiagnosisResult(List<DiagnosisInfo> diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
	}
	public List<DiagnosisInfo> getDiagnosisResult( ) {
		return this.diagnosisResult;
	}

}
