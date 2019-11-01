package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ArticleSummaryAnalysisData;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.articlesummary.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicArticlesummaryDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6363215999541189784L;

	/** 
	 * 文章分析数据列表
	 */
	@ApiListField("data_list")
	@ApiField("article_summary_analysis_data")
	private List<ArticleSummaryAnalysisData> dataList;

	public void setDataList(List<ArticleSummaryAnalysisData> dataList) {
		this.dataList = dataList;
	}
	public List<ArticleSummaryAnalysisData> getDataList( ) {
		return this.dataList;
	}

}
