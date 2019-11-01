package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IcrowdUseResp;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.icrowd.use response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceIcrowdUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833165411681236794L;

	/** 
	 * 接口返回内容
	 */
	@ApiField("icrowd_use_resp")
	private IcrowdUseResp icrowdUseResp;

	public void setIcrowdUseResp(IcrowdUseResp icrowdUseResp) {
		this.icrowdUseResp = icrowdUseResp;
	}
	public IcrowdUseResp getIcrowdUseResp( ) {
		return this.icrowdUseResp;
	}

}
