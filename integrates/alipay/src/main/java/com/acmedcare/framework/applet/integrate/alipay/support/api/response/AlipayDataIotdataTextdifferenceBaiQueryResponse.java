package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TextDiff;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.textdifference.bai.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-22 17:31:43
 */
public class AlipayDataIotdataTextdifferenceBaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2128838272797328979L;

	/** 
	 * 差异化结果以json字符串呈现。
	 */
	@ApiListField("data")
	@ApiField("text_diff")
	private List<TextDiff> data;

	public void setData(List<TextDiff> data) {
		this.data = data;
	}
	public List<TextDiff> getData( ) {
		return this.data;
	}

}
