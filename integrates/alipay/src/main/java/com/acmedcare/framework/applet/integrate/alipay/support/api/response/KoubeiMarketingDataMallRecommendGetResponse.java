package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ItemResp;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.recommend.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataMallRecommendGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5791229168747412137L;

	/** 
	 * 是否还有更多数据：true-是，false-否
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 商圈商品券结构商圈商
	 */
	@ApiListField("items")
	@ApiField("item_resp")
	private List<ItemResp> items;

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setItems(List<ItemResp> items) {
		this.items = items;
	}
	public List<ItemResp> getItems( ) {
		return this.items;
	}

}
