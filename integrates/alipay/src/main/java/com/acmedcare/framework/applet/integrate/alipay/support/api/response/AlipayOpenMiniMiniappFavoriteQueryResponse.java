package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favorite.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-14 10:19:36
 */
public class AlipayOpenMiniMiniappFavoriteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3538275946676326739L;

	/** 
	 * 用户是否已收藏调用方的小程序
	 */
	@ApiField("favorite")
	private Boolean favorite;

	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}
	public Boolean getFavorite( ) {
		return this.favorite;
	}

}
