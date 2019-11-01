package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SingleStartAppVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.developpackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-19 19:28:45
 */
public class AlipayOpenMiniDeveloppackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4819258712782147781L;

	/** 
	 * 单个小程序的启动结果VO
	 */
	@ApiField("single_start_app_vo")
	private SingleStartAppVO singleStartAppVo;

	public void setSingleStartAppVo(SingleStartAppVO singleStartAppVo) {
		this.singleStartAppVo = singleStartAppVo;
	}
	public SingleStartAppVO getSingleStartAppVo( ) {
		return this.singleStartAppVo;
	}

}
