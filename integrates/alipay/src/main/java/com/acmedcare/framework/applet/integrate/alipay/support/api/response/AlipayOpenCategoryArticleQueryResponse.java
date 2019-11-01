package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.LifeRecommendArticles;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.category.article.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenCategoryArticleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3361613786974367912L;

	/** 
	 * 文章列表
	 */
	@ApiListField("articles")
	@ApiField("life_recommend_articles")
	private List<LifeRecommendArticles> articles;

	public void setArticles(List<LifeRecommendArticles> articles) {
		this.articles = articles;
	}
	public List<LifeRecommendArticles> getArticles( ) {
		return this.articles;
	}

}
