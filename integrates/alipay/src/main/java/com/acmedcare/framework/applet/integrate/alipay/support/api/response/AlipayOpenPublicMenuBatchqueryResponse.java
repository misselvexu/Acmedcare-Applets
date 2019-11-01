package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QueryMenu;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicMenuBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5817856311422821115L;

	/** 
	 * 菜单数量，包括默认菜单和个性化菜单
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 菜单列表
	 */
	@ApiListField("menus")
	@ApiField("query_menu")
	private List<QueryMenu> menus;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setMenus(List<QueryMenu> menus) {
		this.menus = menus;
	}
	public List<QueryMenu> getMenus( ) {
		return this.menus;
	}

}
