package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CmItemInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.open.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-18 15:45:54
 */
public class AntMerchantExpandItemOpenBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5882243729315281296L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("cm_item_info")
	private List<CmItemInfo> itemList;

	public void setItemList(List<CmItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<CmItemInfo> getItemList( ) {
		return this.itemList;
	}

}
