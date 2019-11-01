package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FundDetailItemAOPModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.funditem.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:04:20
 */
public class AlipayUserFunditemGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2686552657747273366L;

	/** 
	 * 查询得到的消费记录详细信息（主记录+资金明细列表）
	 */
	@ApiField("fund_detail_item_aopmodel")
	private FundDetailItemAOPModel fundDetailItemAopmodel;

	public void setFundDetailItemAopmodel(FundDetailItemAOPModel fundDetailItemAopmodel) {
		this.fundDetailItemAopmodel = fundDetailItemAopmodel;
	}
	public FundDetailItemAOPModel getFundDetailItemAopmodel( ) {
		return this.fundDetailItemAopmodel;
	}

}
