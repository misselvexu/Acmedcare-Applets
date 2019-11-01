package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 服务窗创建带参二维码接口，开发者自定义信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class CodeInfo extends AlipayObject {

	private static final long serialVersionUID = 4649317936723473215L;

	/**
	 * 跳转URL，扫码关注服务窗后会直接跳转到此URL
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 场景信息
	 */
	@ApiField("scene")
	private Scene scene;

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	public Scene getScene() {
		return this.scene;
	}
	public void setScene(Scene scene) {
		this.scene = scene;
	}

}
