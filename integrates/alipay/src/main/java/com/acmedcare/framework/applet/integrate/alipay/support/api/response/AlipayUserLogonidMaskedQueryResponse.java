package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MaskedLogonIdView;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.logonid.masked.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-30 10:16:18
 */
public class AlipayUserLogonidMaskedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4361711812239571115L;

	/** 
	 * 脱敏后的登录名视图。【注意】如果入参中某一userId不存在，返回的视图列表中将不包含该userId对应视图。（举例：入参里10个userId，其中1个userId不存在，则出参列表里有9个视图）
	 */
	@ApiListField("logon_id_views")
	@ApiField("masked_logon_id_view")
	private List<MaskedLogonIdView> logonIdViews;

	public void setLogonIdViews(List<MaskedLogonIdView> logonIdViews) {
		this.logonIdViews = logonIdViews;
	}
	public List<MaskedLogonIdView> getLogonIdViews( ) {
		return this.logonIdViews;
	}

}
