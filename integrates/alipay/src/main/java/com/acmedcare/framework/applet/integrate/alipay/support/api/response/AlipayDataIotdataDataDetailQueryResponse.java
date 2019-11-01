package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SummaryData;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.data.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-04 21:56:34
 */
public class AlipayDataIotdataDataDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3715893593811197113L;

	/** 
	 * 感知数据列表
	 */
	@ApiListField("data")
	@ApiField("summary_data")
	private List<SummaryData> data;

	public void setData(List<SummaryData> data) {
		this.data = data;
	}
	public List<SummaryData> getData( ) {
		return this.data;
	}

}
