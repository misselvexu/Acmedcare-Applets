package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MerchantshopCommentResult;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MerchantshopCommentStatistic;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.merchantshop.comment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 11:19:04
 */
public class AlipayEcoMycarMerchantshopCommentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3612521819931926792L;

	/** 
	 * 评论信息
	 */
	@ApiListField("comment_result")
	@ApiField("merchantshop_comment_result")
	private List<MerchantshopCommentResult> commentResult;

	/** 
	 * 评论统计信息
	 */
	@ApiField("comment_statistic")
	private MerchantshopCommentStatistic commentStatistic;

	public void setCommentResult(List<MerchantshopCommentResult> commentResult) {
		this.commentResult = commentResult;
	}
	public List<MerchantshopCommentResult> getCommentResult( ) {
		return this.commentResult;
	}

	public void setCommentStatistic(MerchantshopCommentStatistic commentStatistic) {
		this.commentStatistic = commentStatistic;
	}
	public MerchantshopCommentStatistic getCommentStatistic( ) {
		return this.commentStatistic;
	}

}
