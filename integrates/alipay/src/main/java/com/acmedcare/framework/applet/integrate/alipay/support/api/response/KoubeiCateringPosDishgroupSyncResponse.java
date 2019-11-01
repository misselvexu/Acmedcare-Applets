package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dishgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosDishgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1453837979284517157L;

	/** 
	 * 返回对应的组合菜ID
	 */
	@ApiField("dish_group_id")
	private String dishGroupId;

	public void setDishGroupId(String dishGroupId) {
		this.dishGroupId = dishGroupId;
	}
	public String getDishGroupId( ) {
		return this.dishGroupId;
	}

}
