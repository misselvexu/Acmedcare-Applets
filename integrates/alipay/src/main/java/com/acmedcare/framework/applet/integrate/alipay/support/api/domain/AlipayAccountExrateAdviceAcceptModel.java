package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 标准的兑换交易受理接口
 *
 * @author auto create
 * @since 1.0, 2016-05-13 15:15:53
 */
public class AlipayAccountExrateAdviceAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 4734791645771933618L;

	/**
	 * 交易请求对象内容
	 */
	@ApiField("advice")
	private AdviceVO advice;

	public AdviceVO getAdvice() {
		return this.advice;
	}
	public void setAdvice(AdviceVO advice) {
		this.advice = advice;
	}

}
