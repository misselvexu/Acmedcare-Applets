package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromoteDateModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotesummary.date.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDataPromotesummaryDateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1261856386786145544L;

	/** 
	 * 口碑客推广日期维度汇总数据
	 */
	@ApiListField("data")
	@ApiField("promote_date_model")
	private List<PromoteDateModel> data;

	public void setData(List<PromoteDateModel> data) {
		this.data = data;
	}
	public List<PromoteDateModel> getData( ) {
		return this.data;
	}

}
