package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.RecomProduct;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.product.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-08 10:20:51
 */
public class AlipayInsMarketingProductRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1581248745882522468L;

	/** 
	 * 产品列表
	 */
	@ApiListField("products")
	@ApiField("recom_product")
	private List<RecomProduct> products;

	/** 
	 * 推荐流水号
	 */
	@ApiField("recom_flow_no")
	private String recomFlowNo;

	public void setProducts(List<RecomProduct> products) {
		this.products = products;
	}
	public List<RecomProduct> getProducts( ) {
		return this.products;
	}

	public void setRecomFlowNo(String recomFlowNo) {
		this.recomFlowNo = recomFlowNo;
	}
	public String getRecomFlowNo( ) {
		return this.recomFlowNo;
	}

}
