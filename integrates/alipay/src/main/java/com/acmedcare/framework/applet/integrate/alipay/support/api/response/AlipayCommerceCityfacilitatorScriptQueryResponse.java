package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.script.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceCityfacilitatorScriptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7414169945437615232L;

	/** 
	 * 脚本内容，智能卡中心自定义的脚本格式内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 脚本更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

}
