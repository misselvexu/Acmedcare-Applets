package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CityFunction;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.city.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceCityfacilitatorCityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3296193191692329934L;

	/** 
	 * 城市列表
	 */
	@ApiListField("citys")
	@ApiField("city_function")
	private List<CityFunction> citys;

	public void setCitys(List<CityFunction> citys) {
		this.citys = citys;
	}
	public List<CityFunction> getCitys( ) {
		return this.citys;
	}

}
