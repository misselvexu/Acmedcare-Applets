package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 服务详细信息查询
 *
 * @author auto create
 * @since 1.0, 2019-08-01 20:35:14
 */
public class AlipayOpenAppServiceMiniappnearbypoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1788273544384977745L;

	/**
	 * poiCode列表
	 */
	@ApiListField("poi_code_list")
	@ApiField("string")
	private List<String> poiCodeList;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public List<String> getPoiCodeList() {
		return this.poiCodeList;
	}
	public void setPoiCodeList(List<String> poiCodeList) {
		this.poiCodeList = poiCodeList;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
