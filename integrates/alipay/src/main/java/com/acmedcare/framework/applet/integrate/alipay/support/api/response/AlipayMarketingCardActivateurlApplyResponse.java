package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.activateurl.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-12 11:16:07
 */
public class AlipayMarketingCardActivateurlApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2291494349124372164L;

	/** 
	 * 会员卡领卡链接(使用时需URLDecode解码)。商户获取此链接后可投放到服务窗消息、店铺二维码等。
	 */
	@ApiField("apply_card_url")
	private String applyCardUrl;

	public void setApplyCardUrl(String applyCardUrl) {
		this.applyCardUrl = applyCardUrl;
	}
	public String getApplyCardUrl( ) {
		return this.applyCardUrl;
	}

}
