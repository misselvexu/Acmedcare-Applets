package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CreativeDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 21:42:16
 */
public class AlipayDataDataserviceAdCreativeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1894759676132565352L;

	/** 
	 * 创意详情
	 */
	@ApiField("creative_detail")
	private CreativeDetail creativeDetail;

	public void setCreativeDetail(CreativeDetail creativeDetail) {
		this.creativeDetail = creativeDetail;
	}
	public CreativeDetail getCreativeDetail( ) {
		return this.creativeDetail;
	}

}
