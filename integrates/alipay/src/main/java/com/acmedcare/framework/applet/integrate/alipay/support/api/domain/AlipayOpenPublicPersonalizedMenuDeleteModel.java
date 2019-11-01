package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 个性化菜单删除
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:48:55
 */
public class AlipayOpenPublicPersonalizedMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4445633696797328568L;

	/**
	 * 要删除的个性化菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	public String getMenuKey() {
		return this.menuKey;
	}
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

}
