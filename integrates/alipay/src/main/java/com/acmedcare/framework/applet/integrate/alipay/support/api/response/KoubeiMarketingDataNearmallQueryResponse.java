package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.NearMallBo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.nearmall.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataNearmallQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2252432839216171446L;

	/** 
	 * 商圈信息
	 */
	@ApiListField("near_mall_bos")
	@ApiField("near_mall_bo")
	private List<NearMallBo> nearMallBos;

	public void setNearMallBos(List<NearMallBo> nearMallBos) {
		this.nearMallBos = nearMallBos;
	}
	public List<NearMallBo> getNearMallBos( ) {
		return this.nearMallBos;
	}

}
