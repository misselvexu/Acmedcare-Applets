package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newsfeed.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseMcommentNewsfeedAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5625663543756341271L;

	/** 
	 * 新评论id
	 */
	@ApiField("newsfeed_id")
	private String newsfeedId;

	public void setNewsfeedId(String newsfeedId) {
		this.newsfeedId = newsfeedId;
	}
	public String getNewsfeedId( ) {
		return this.newsfeedId;
	}

}
