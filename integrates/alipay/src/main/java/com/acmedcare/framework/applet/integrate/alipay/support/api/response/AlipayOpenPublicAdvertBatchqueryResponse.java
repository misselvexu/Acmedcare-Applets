package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.Advert;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicAdvertBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3152271839589692687L;

	/** 
	 * 广告位list ,目前只有一个广告位
	 */
	@ApiListField("advert_list")
	@ApiField("advert")
	private List<Advert> advertList;

	public void setAdvertList(List<Advert> advertList) {
		this.advertList = advertList;
	}
	public List<Advert> getAdvertList( ) {
		return this.advertList;
	}

}
