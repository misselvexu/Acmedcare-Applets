package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.EduOneCardBalanceQueryResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.balance.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcardEduBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4749237986956145275L;

	/** 
	 * 校园一卡通余额查询结果对象
	 */
	@ApiListField("balance")
	@ApiField("edu_one_card_balance_query_result")
	private List<EduOneCardBalanceQueryResult> balance;

	public void setBalance(List<EduOneCardBalanceQueryResult> balance) {
		this.balance = balance;
	}
	public List<EduOneCardBalanceQueryResult> getBalance( ) {
		return this.balance;
	}

}
