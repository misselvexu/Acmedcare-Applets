package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QueryUserChargeInstAndAreaInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.user.chargeinst.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppUserChargeinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4249846967178699659L;

	/** 
	 * 提供给邦道的接口，查询用户常缴机构与常住城市信息，该对象为输出具体内容。
	 */
	@ApiListField("data_list")
	@ApiField("query_user_charge_inst_and_area_info")
	private List<QueryUserChargeInstAndAreaInfo> dataList;

	public void setDataList(List<QueryUserChargeInstAndAreaInfo> dataList) {
		this.dataList = dataList;
	}
	public List<QueryUserChargeInstAndAreaInfo> getDataList( ) {
		return this.dataList;
	}

}
