package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 阿里云语音回调接口
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:11
 */
public class AlipayEcoTextVoiceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8896185543496588174L;

	/**
	 * 语音回调列表
	 */
	@ApiListField("callbacks")
	@ApiField("spi_voice_callback")
	private List<SpiVoiceCallback> callbacks;

	public List<SpiVoiceCallback> getCallbacks() {
		return this.callbacks;
	}
	public void setCallbacks(List<SpiVoiceCallback> callbacks) {
		this.callbacks = callbacks;
	}

}
