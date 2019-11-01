package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertSpecialAdvContentModifyResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.specialadvcontent.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionSpecialadvcontentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2515783789656657232L;

	/** 
	 * 修改特殊广告内容的返回结果
	 */
	@ApiListField("data")
	@ApiField("kb_advert_special_adv_content_modify_response")
	private List<KbAdvertSpecialAdvContentModifyResponse> data;

	public void setData(List<KbAdvertSpecialAdvContentModifyResponse> data) {
		this.data = data;
	}
	public List<KbAdvertSpecialAdvContentModifyResponse> getData( ) {
		return this.data;
	}

}
