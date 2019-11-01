package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QueryProvCityInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.provcity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppProdmodeProvcityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5456699955594874944L;

	/** 
	 * 返回省市下拉列表数据
	 */
	@ApiListField("data_list")
	@ApiField("query_prov_city_info")
	private List<QueryProvCityInfo> dataList;

	public void setDataList(List<QueryProvCityInfo> dataList) {
		this.dataList = dataList;
	}
	public List<QueryProvCityInfo> getDataList( ) {
		return this.dataList;
	}

}
