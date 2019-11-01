package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IndirectIsvInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.tiansuo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 13:10:01
 */
public class AntMerchantExpandIndirectTiansuoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6164814463498932632L;

	/** 
	 * 间连商户pid和对应名称信息
	 */
	@ApiListField("indirect_isv_info")
	@ApiField("indirect_isv_info")
	private List<IndirectIsvInfo> indirectIsvInfo;

	public void setIndirectIsvInfo(List<IndirectIsvInfo> indirectIsvInfo) {
		this.indirectIsvInfo = indirectIsvInfo;
	}
	public List<IndirectIsvInfo> getIndirectIsvInfo( ) {
		return this.indirectIsvInfo;
	}

}
