package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.applogo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-24 12:53:04
 */
public class AlipayOpenMiniInnerbaseinfoApplogoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2521967886389335786L;

	/** 
	 * 上传图片结果地址
	 */
	@ApiField("app_logo")
	private String appLogo;

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

}
