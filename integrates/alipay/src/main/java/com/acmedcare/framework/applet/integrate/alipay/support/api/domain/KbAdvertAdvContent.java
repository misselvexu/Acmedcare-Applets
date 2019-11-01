package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广内容
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertAdvContent extends AlipayObject {

	private static final long serialVersionUID = 2284588689662285432L;

	/**
	 * 二维码
	 */
	@ApiField("codec")
	private String codec;

	/**
	 * 访问地址
	 */
	@ApiField("link_url")
	private String linkUrl;

	public String getCodec() {
		return this.codec;
	}
	public void setCodec(String codec) {
		this.codec = codec;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

}
