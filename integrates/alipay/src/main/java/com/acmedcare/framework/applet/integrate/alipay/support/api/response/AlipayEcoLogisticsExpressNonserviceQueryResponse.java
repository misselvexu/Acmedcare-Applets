package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AreaCode;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.logistics.express.nonservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoLogisticsExpressNonserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2542927571721239827L;

	/** 
	 * 非服务区区域代码列表
	 */
	@ApiListField("area_codes")
	@ApiField("area_code")
	private List<AreaCode> areaCodes;

	public void setAreaCodes(List<AreaCode> areaCodes) {
		this.areaCodes = areaCodes;
	}
	public List<AreaCode> getAreaCodes( ) {
		return this.areaCodes;
	}

}
