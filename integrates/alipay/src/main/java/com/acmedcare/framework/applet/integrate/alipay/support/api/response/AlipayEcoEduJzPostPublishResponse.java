package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.jz.post.publish response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEduJzPostPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7438959481592851735L;

	/** 
	 * 职位编号
	 */
	@ApiField("third_id")
	private String thirdId;

	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}
	public String getThirdId( ) {
		return this.thirdId;
	}

}
