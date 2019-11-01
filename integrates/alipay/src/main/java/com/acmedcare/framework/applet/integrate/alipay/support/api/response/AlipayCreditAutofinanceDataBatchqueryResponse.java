package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SceneDataQueryResultDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditAutofinanceDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4246767796974326912L;

	/** 
	 * 订单数据查询的返回值。通过列表方式批量返回机构的订单查询数据。通过系统控制返回的数据中不包含客户的敏感信息。
	 */
	@ApiListField("result_data")
	@ApiField("scene_data_query_result_detail")
	private List<SceneDataQueryResultDetail> resultData;

	public void setResultData(List<SceneDataQueryResultDetail> resultData) {
		this.resultData = resultData;
	}
	public List<SceneDataQueryResultDetail> getResultData( ) {
		return this.resultData;
	}

}
