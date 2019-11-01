package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 对账配置查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:32
 */
public class AlipayEbppProdmodeReconconfQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4623574757144373497L;

	/**
	 * 缴费业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 销账机构编码
	 */
	@ApiField("chargeoff_code")
	private String chargeoffCode;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeoffCode() {
		return this.chargeoffCode;
	}
	public void setChargeoffCode(String chargeoffCode) {
		this.chargeoffCode = chargeoffCode;
	}

}
