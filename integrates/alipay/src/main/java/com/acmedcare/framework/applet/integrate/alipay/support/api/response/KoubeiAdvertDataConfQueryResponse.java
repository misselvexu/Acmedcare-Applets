package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbadvertChannelTypeResponse;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbadvertCommissionLimit;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.conf.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDataConfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854686358833733754L;

	/** 
	 * 渠道类型配置
	 */
	@ApiListField("channel_types")
	@ApiField("kbadvert_channel_type_response")
	private List<KbadvertChannelTypeResponse> channelTypes;

	/** 
	 * 分佣配置金额
	 */
	@ApiListField("commission_limits")
	@ApiField("kbadvert_commission_limit")
	private List<KbadvertCommissionLimit> commissionLimits;

	public void setChannelTypes(List<KbadvertChannelTypeResponse> channelTypes) {
		this.channelTypes = channelTypes;
	}
	public List<KbadvertChannelTypeResponse> getChannelTypes( ) {
		return this.channelTypes;
	}

	public void setCommissionLimits(List<KbadvertCommissionLimit> commissionLimits) {
		this.commissionLimits = commissionLimits;
	}
	public List<KbadvertCommissionLimit> getCommissionLimits( ) {
		return this.commissionLimits;
	}

}
