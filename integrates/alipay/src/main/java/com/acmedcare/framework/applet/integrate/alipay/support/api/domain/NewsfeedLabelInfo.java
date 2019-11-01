package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 生活记录信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class NewsfeedLabelInfo extends AlipayObject {

	private static final long serialVersionUID = 7273825777173639643L;

	/**
	 * 根据主谓宾的格式生成动态的标题，此字段为谓语
	 */
	@ApiField("action")
	private String action;

	/**
	 * label行的跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	/**
	 * 根据主谓宾的格式生成动态的标题，此字段为宾语
	 */
	@ApiField("target")
	private String target;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getScheme() {
		return this.scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

}
