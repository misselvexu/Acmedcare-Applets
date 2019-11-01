package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ItemModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-16 12:30:22
 */
public class AntMerchantExpandItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8139685914991855736L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_model")
	private List<ItemModel> itemList;

	public void setItemList(List<ItemModel> itemList) {
		this.itemList = itemList;
	}
	public List<ItemModel> getItemList( ) {
		return this.itemList;
	}

}
