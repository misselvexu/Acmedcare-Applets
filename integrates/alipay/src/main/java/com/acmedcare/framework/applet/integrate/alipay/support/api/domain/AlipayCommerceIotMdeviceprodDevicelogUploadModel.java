package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 上传设备行为日志
 *
 * @author auto create
 * @since 1.0, 2019-09-16 16:58:37
 */
public class AlipayCommerceIotMdeviceprodDevicelogUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3563353759863892932L;

	/**
	 * 行为日志主体
	 */
	@ApiField("body")
	private String body;

	/**
	 * 日志模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
