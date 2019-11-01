package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PassInfoOpenApiModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pass.grouplist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserPassGrouplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5493633773627565898L;

	/** 
	 * 券信息列表
	 */
	@ApiListField("pass_info_list")
	@ApiField("pass_info_open_api_model")
	private List<PassInfoOpenApiModel> passInfoList;

	public void setPassInfoList(List<PassInfoOpenApiModel> passInfoList) {
		this.passInfoList = passInfoList;
	}
	public List<PassInfoOpenApiModel> getPassInfoList( ) {
		return this.passInfoList;
	}

}
