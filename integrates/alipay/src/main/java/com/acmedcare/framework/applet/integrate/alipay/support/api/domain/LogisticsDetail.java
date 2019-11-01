package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2019-04-02 16:24:40
 */
public class LogisticsDetail extends AlipayObject {

	private static final long serialVersionUID = 7467852631917728845L;

	/**
	 * 物流类型, 
POST 平邮,
EXPRESS 其他快递,
VIRTUAL 虚拟物品,
EMS EMS,
DIRECT 无需物流。
	 */
	@ApiField("logistics_type")
	private String logisticsType;

	public String getLogisticsType() {
		return this.logisticsType;
	}
	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

}
