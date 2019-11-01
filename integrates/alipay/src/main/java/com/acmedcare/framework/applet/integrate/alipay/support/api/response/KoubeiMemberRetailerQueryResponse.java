package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.Retailer;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.retailer.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMemberRetailerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6524146765848429521L;

	/** 
	 * 零售商信息列表
	 */
	@ApiListField("retailer_list")
	@ApiField("retailer")
	private List<Retailer> retailerList;

	public void setRetailerList(List<Retailer> retailerList) {
		this.retailerList = retailerList;
	}
	public List<Retailer> getRetailerList( ) {
		return this.retailerList;
	}

}
