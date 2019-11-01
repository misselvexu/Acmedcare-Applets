package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SubCloudUserInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.subuserinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbcloudSubuserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1278831936199476865L;

	/** 
	 * 口碑子账号数据列表
	 */
	@ApiListField("sub_cloud_user_list")
	@ApiField("sub_cloud_user_info")
	private List<SubCloudUserInfo> subCloudUserList;

	public void setSubCloudUserList(List<SubCloudUserInfo> subCloudUserList) {
		this.subCloudUserList = subCloudUserList;
	}
	public List<SubCloudUserInfo> getSubCloudUserList( ) {
		return this.subCloudUserList;
	}

}
