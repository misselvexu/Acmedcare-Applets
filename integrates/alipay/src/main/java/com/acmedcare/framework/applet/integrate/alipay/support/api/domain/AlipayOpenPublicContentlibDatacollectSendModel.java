package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 内容中台爬虫数据推送接口
 *
 * @author auto create
 * @since 1.0, 2017-11-24 11:20:06
 */
public class AlipayOpenPublicContentlibDatacollectSendModel extends AlipayObject {

	private static final long serialVersionUID = 6647299624126916227L;

	/**
	 * 爬虫平台推送数据，为json字符串，bizNo 为推送流水号，taskName为任务名，业务数据包含在bizData中
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
