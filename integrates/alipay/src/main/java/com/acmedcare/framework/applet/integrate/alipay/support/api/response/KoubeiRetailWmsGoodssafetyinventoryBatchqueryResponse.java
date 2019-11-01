package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.GoodsSafetyInventoryVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.goodssafetyinventory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsGoodssafetyinventoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6691655945144823878L;

	/** 
	 * 货品安全库存列表
	 */
	@ApiListField("goods_safety_inventory_vo_list")
	@ApiField("goods_safety_inventory_v_o")
	private List<GoodsSafetyInventoryVO> goodsSafetyInventoryVoList;

	public void setGoodsSafetyInventoryVoList(List<GoodsSafetyInventoryVO> goodsSafetyInventoryVoList) {
		this.goodsSafetyInventoryVoList = goodsSafetyInventoryVoList;
	}
	public List<GoodsSafetyInventoryVO> getGoodsSafetyInventoryVoList( ) {
		return this.goodsSafetyInventoryVoList;
	}

}
