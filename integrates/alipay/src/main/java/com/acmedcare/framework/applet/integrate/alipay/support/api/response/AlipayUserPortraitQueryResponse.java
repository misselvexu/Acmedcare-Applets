package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PintuanUserInfos;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.portrait.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserPortraitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4164134562436593217L;

	/** 
	 * 拼团信息列表
	 */
	@ApiListField("pintuan_user_infos")
	@ApiField("pintuan_user_infos")
	private List<PintuanUserInfos> pintuanUserInfos;

	public void setPintuanUserInfos(List<PintuanUserInfos> pintuanUserInfos) {
		this.pintuanUserInfos = pintuanUserInfos;
	}
	public List<PintuanUserInfos> getPintuanUserInfos( ) {
		return this.pintuanUserInfos;
	}

}
