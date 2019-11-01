package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 市场风险平台风险因子计算
 *
 * @author auto create
 * @since 1.0, 2019-07-25 11:38:04
 */
public class AlipayAccountFinriskMarkriskDatafactorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3392525659118166761L;

	/**
	 * Json格式表示市场风险损益计算入参
	 */
	@ApiField("data_factor_build_req")
	private String dataFactorBuildReq;

	public String getDataFactorBuildReq() {
		return this.dataFactorBuildReq;
	}
	public void setDataFactorBuildReq(String dataFactorBuildReq) {
		this.dataFactorBuildReq = dataFactorBuildReq;
	}

}
