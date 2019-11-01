package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DataSecCheckResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.check.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataMallCheckGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2148274672991972217L;

	/** 
	 * 返回数据字段
	 */
	@ApiListField("data_results")
	@ApiField("data_sec_check_result")
	private List<DataSecCheckResult> dataResults;

	public void setDataResults(List<DataSecCheckResult> dataResults) {
		this.dataResults = dataResults;
	}
	public List<DataSecCheckResult> getDataResults( ) {
		return this.dataResults;
	}

}
