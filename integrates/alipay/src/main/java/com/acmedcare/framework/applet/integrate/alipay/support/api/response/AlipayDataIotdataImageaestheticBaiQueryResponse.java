package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AestheticData;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.imageaesthetic.bai.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-02 16:44:40
 */
public class AlipayDataIotdataImageaestheticBaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1652391878831451831L;

	/** 
	 * 返回图片URL、打分结果和错误信息
	 */
	@ApiField("data")
	private AestheticData data;

	public void setData(AestheticData data) {
		this.data = data;
	}
	public AestheticData getData( ) {
		return this.data;
	}

}
