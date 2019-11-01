package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExSourceRateVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.sourcerate.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-08 00:55:01
 */
public class AlipayAccountExrateSourcerateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4573834347931423178L;

	/** 
	 * 源汇率记录
	 */
	@ApiListField("source_rate_list")
	@ApiField("ex_source_rate_v_o")
	private List<ExSourceRateVO> sourceRateList;

	public void setSourceRateList(List<ExSourceRateVO> sourceRateList) {
		this.sourceRateList = sourceRateList;
	}
	public List<ExSourceRateVO> getSourceRateList( ) {
		return this.sourceRateList;
	}

}
