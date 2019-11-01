package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.content.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicMessageContentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7637621651263256425L;

	/** 
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 内容详情内链url
	 */
	@ApiField("content_url")
	private String contentUrl;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getContentUrl( ) {
		return this.contentUrl;
	}

}
