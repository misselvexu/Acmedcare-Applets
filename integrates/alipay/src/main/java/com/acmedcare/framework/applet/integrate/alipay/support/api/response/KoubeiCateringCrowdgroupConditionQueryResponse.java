package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.UserCrowdConditions;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.crowdgroup.condition.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringCrowdgroupConditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3893236519253248792L;

	/** 
	 * isv创建的用户规则分组描述
	 */
	@ApiListField("condition_list")
	@ApiField("user_crowd_conditions")
	private List<UserCrowdConditions> conditionList;

	public void setConditionList(List<UserCrowdConditions> conditionList) {
		this.conditionList = conditionList;
	}
	public List<UserCrowdConditions> getConditionList( ) {
		return this.conditionList;
	}

}
