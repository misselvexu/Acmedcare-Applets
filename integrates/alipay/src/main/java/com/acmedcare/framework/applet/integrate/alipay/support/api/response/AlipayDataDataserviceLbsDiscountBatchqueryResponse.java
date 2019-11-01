package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AntlbsKBDiscountInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.lbs.discount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceLbsDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7793428426267147777L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("antlbs_k_b_discount_info")
	private List<AntlbsKBDiscountInfo> discounts;

	public void setDiscounts(List<AntlbsKBDiscountInfo> discounts) {
		this.discounts = discounts;
	}
	public List<AntlbsKBDiscountInfo> getDiscounts( ) {
		return this.discounts;
	}

}
