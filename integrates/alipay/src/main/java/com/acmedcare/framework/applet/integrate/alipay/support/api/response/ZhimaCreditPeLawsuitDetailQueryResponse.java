package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.EpInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.lawsuit.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditPeLawsuitDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2764223839771389723L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 个人涉诉详情信息
	 */
	@ApiField("lawsuit_detail")
	private EpInfo lawsuitDetail;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLawsuitDetail(EpInfo lawsuitDetail) {
		this.lawsuitDetail = lawsuitDetail;
	}
	public EpInfo getLawsuitDetail( ) {
		return this.lawsuitDetail;
	}

}
