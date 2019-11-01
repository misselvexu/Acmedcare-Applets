package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmember.delete response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseChatGmemberDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5411235976425771435L;

	/** 
	 * 删除结果
	 */
	@ApiField("result_delete")
	private Boolean resultDelete;

	public void setResultDelete(Boolean resultDelete) {
		this.resultDelete = resultDelete;
	}
	public Boolean getResultDelete( ) {
		return this.resultDelete;
	}

}
