package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MiniAppClientVersionInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerclientinfo.defaultversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-10 19:56:08
 */
public class AlipayOpenMiniInnerclientinfoDefaultversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3355751516188181596L;

	/** 
	 * Android客户端版本信息
	 */
	@ApiField("android_client_version_info")
	private MiniAppClientVersionInfo androidClientVersionInfo;

	/** 
	 * iOS客户单版本号信息
	 */
	@ApiField("ios_client_version_info")
	private MiniAppClientVersionInfo iosClientVersionInfo;

	public void setAndroidClientVersionInfo(MiniAppClientVersionInfo androidClientVersionInfo) {
		this.androidClientVersionInfo = androidClientVersionInfo;
	}
	public MiniAppClientVersionInfo getAndroidClientVersionInfo( ) {
		return this.androidClientVersionInfo;
	}

	public void setIosClientVersionInfo(MiniAppClientVersionInfo iosClientVersionInfo) {
		this.iosClientVersionInfo = iosClientVersionInfo;
	}
	public MiniAppClientVersionInfo getIosClientVersionInfo( ) {
		return this.iosClientVersionInfo;
	}

}
