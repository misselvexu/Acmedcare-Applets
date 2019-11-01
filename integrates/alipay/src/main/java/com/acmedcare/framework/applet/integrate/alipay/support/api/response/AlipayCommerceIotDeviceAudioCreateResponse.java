package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.audio.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-20 20:45:41
 */
public class AlipayCommerceIotDeviceAudioCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3467751867542631292L;

	/** 
	 * 语音id
	 */
	@ApiField("audio_id")
	private String audioId;

	/** 
	 * 语音文件的地址.用户可以通过此地址试听合成的语音
	 */
	@ApiField("audio_url")
	private String audioUrl;

	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}
	public String getAudioId( ) {
		return this.audioId;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}
	public String getAudioUrl( ) {
		return this.audioUrl;
	}

}
