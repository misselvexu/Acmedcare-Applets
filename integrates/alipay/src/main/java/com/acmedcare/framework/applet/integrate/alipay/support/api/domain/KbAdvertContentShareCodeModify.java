package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建吱口令模型
 *
 * @author auto create
 * @since 1.0, 2017-03-01 15:38:03
 */
public class KbAdvertContentShareCodeModify extends AlipayObject {

	private static final long serialVersionUID = 7871157583454431224L;

	/**
	 * 宣传展示标题（不能超过30个字符）
	 */
	@ApiField("display_title")
	private String displayTitle;

	public String getDisplayTitle() {
		return this.displayTitle;
	}
	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}

}
