package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PosDishQryModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dish.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8525786251591366542L;

	/** 
	 * 口碑盒子菜品的详情
	 */
	@ApiField("pos_dish_qry_model")
	private PosDishQryModel posDishQryModel;

	public void setPosDishQryModel(PosDishQryModel posDishQryModel) {
		this.posDishQryModel = posDishQryModel;
	}
	public PosDishQryModel getPosDishQryModel( ) {
		return this.posDishQryModel;
	}

}
