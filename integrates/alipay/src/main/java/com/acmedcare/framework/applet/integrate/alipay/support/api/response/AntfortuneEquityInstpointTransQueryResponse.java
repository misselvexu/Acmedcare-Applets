package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PointTransInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.trans.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-01 11:20:03
 */
public class AntfortuneEquityInstpointTransQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5349265444125495835L;

	/** 
	 * 查询到的结果
	 */
	@ApiListField("trans_info")
	@ApiField("point_trans_info")
	private List<PointTransInfo> transInfo;

	public void setTransInfo(List<PointTransInfo> transInfo) {
		this.transInfo = transInfo;
	}
	public List<PointTransInfo> getTransInfo( ) {
		return this.transInfo;
	}

}
