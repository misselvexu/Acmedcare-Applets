package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dishbatch.delete response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosDishbatchDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3557721475774412589L;

	/** 
	 * 删除成功的ID
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}
	public List<String> getDishIds( ) {
		return this.dishIds;
	}

}
