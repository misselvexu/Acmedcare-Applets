package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SpiDetectionDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.text.detect response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:54
 */
public class AlipayEcoTextDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 3648775113363986816L;

	/** 
	 * 检测结果
	 */
	@ApiListField("data")
	@ApiField("spi_detection_detail")
	private List<SpiDetectionDetail> data;

	public void setData(List<SpiDetectionDetail> data) {
		this.data = data;
	}
	public List<SpiDetectionDetail> getData( ) {
		return this.data;
	}

}
