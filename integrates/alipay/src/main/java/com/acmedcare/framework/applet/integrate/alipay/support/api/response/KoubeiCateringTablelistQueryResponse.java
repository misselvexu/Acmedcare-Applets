package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TableInfoResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.tablelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringTablelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1124681551433787278L;

	/** 
	 * 返回tablelistresult列表
	 */
	@ApiField("tableinfo_result")
	private TableInfoResult tableinfoResult;

	public void setTableinfoResult(TableInfoResult tableinfoResult) {
		this.tableinfoResult = tableinfoResult;
	}
	public TableInfoResult getTableinfoResult( ) {
		return this.tableinfoResult;
	}

}
