package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AdCreativeResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.creative.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdCreativeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2571278675419557122L;

	/** 
	 * 广告创意详情；是否唯一(不需要)；用于通过创意ID查询创意详情；admgr广告创意查询返回
	 */
	@ApiField("ad_creative_result")
	private AdCreativeResult adCreativeResult;

	public void setAdCreativeResult(AdCreativeResult adCreativeResult) {
		this.adCreativeResult = adCreativeResult;
	}
	public AdCreativeResult getAdCreativeResult( ) {
		return this.adCreativeResult;
	}

}
