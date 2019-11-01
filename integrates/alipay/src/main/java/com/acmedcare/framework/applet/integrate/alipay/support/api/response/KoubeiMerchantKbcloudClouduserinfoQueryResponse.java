package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CloudUserInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.clouduserinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbcloudClouduserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7867383943959786728L;

	/** 
	 * 口碑云主账号数据列表
	 */
	@ApiListField("cloud_user_list")
	@ApiField("cloud_user_info")
	private List<CloudUserInfo> cloudUserList;

	public void setCloudUserList(List<CloudUserInfo> cloudUserList) {
		this.cloudUserList = cloudUserList;
	}
	public List<CloudUserInfo> getCloudUserList( ) {
		return this.cloudUserList;
	}

}
