package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AssetProduceItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetproduce.assign.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntMerchantExpandAssetproduceAssignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2517553453493873164L;

	/** 
	 * 生产指令集合, 订单明细ID(assign_item_id)为唯一键值.
	 */
	@ApiListField("asset_produce_items")
	@ApiField("asset_produce_item")
	private List<AssetProduceItem> assetProduceItems;

	/** 
	 * 当前是否还有生产指令可以拉取; 注意如果该值为false, 也只是提示当前没有更多生产指令了, 不代表后面没有生产指令, 商户需要自己制定策略定时去拉取.
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	public void setAssetProduceItems(List<AssetProduceItem> assetProduceItems) {
		this.assetProduceItems = assetProduceItems;
	}
	public List<AssetProduceItem> getAssetProduceItems( ) {
		return this.assetProduceItems;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}