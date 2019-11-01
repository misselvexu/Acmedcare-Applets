package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbdishCookInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.cook.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-16 17:30:40
 */
public class KoubeiCateringDishCookSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6774141342936211229L;

	/** 
	 * 操作后返回整个模型
	 */
	@ApiField("kb_dish_cook")
	private KbdishCookInfo kbDishCook;

	public void setKbDishCook(KbdishCookInfo kbDishCook) {
		this.kbDishCook = kbDishCook;
	}
	public KbdishCookInfo getKbDishCook( ) {
		return this.kbDishCook;
	}

}
