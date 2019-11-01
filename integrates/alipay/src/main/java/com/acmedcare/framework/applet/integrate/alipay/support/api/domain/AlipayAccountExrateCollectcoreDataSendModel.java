package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 金融信息受理接口
 *
 * @author auto create
 * @since 1.0, 2017-08-28 17:28:50
 */
public class AlipayAccountExrateCollectcoreDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 4611817225858781274L;

	/**
	 * 上数提交数据内容
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
