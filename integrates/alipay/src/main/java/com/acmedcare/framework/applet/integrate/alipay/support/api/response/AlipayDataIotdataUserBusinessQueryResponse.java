package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.UserBusiness;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.user.business.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-04 21:56:56
 */
public class AlipayDataIotdataUserBusinessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8216545168682288315L;

	/** 
	 * 用户管理的业务列表
	 */
	@ApiListField("data")
	@ApiField("user_business")
	private List<UserBusiness> data;

	public void setData(List<UserBusiness> data) {
		this.data = data;
	}
	public List<UserBusiness> getData( ) {
		return this.data;
	}

}
