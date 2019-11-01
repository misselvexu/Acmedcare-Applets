package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.EbppUserChargeInstInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.userinstinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppJfUserinstinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8656194622644681837L;

	/** 
	 * 机构信息列表
	 */
	@ApiListField("user_charge_inst_info_list")
	@ApiField("ebpp_user_charge_inst_info")
	private List<EbppUserChargeInstInfo> userChargeInstInfoList;

	public void setUserChargeInstInfoList(List<EbppUserChargeInstInfo> userChargeInstInfoList) {
		this.userChargeInstInfoList = userChargeInstInfoList;
	}
	public List<EbppUserChargeInstInfo> getUserChargeInstInfoList( ) {
		return this.userChargeInstInfoList;
	}

}
