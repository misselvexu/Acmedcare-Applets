package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 修改货品安全库存
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:16
 */
public class KoubeiRetailWmsGoodssafetyinventoryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7374548941649292144L;

	/**
	 * 货品安全库存
	 */
	@ApiListField("goods_safety_inventorys")
	@ApiField("goods_safety_inventory")
	private List<GoodsSafetyInventory> goodsSafetyInventorys;

	public List<GoodsSafetyInventory> getGoodsSafetyInventorys() {
		return this.goodsSafetyInventorys;
	}
	public void setGoodsSafetyInventorys(List<GoodsSafetyInventory> goodsSafetyInventorys) {
		this.goodsSafetyInventorys = goodsSafetyInventorys;
	}

}
