package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BudgetLibResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 17:45:47
 */
public class AlipayAssetPointPointprodBudgetlibQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4128894474695689991L;

	/** 
	 * 集分宝预算库实体模型，包含预算库编码，余额等
	 */
	@ApiField("result")
	private BudgetLibResult result;

	public void setResult(BudgetLibResult result) {
		this.result = result;
	}
	public BudgetLibResult getResult( ) {
		return this.result;
	}

}
