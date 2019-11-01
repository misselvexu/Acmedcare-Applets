package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ActivityQueryResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favoritegift.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniMiniappFavoritegiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7124649919689389775L;

	/** 
	 * 收藏有礼查询用户对应小程序的查询结果列表
	 */
	@ApiListField("result_list")
	@ApiField("activity_query_result")
	private List<ActivityQueryResult> resultList;

	public void setResultList(List<ActivityQueryResult> resultList) {
		this.resultList = resultList;
	}
	public List<ActivityQueryResult> getResultList( ) {
		return this.resultList;
	}

}
