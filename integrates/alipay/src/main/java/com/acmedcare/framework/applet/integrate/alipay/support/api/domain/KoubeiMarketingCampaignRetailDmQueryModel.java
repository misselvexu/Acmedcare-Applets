package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容查询接口
 *
 * @author auto create
 * @since 1.0, 2017-07-19 22:12:39
 */
public class KoubeiMarketingCampaignRetailDmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2443261839581881915L;

	/**
	 * 内容id，通过调用koubei.marketing.campaign.retail.dm.create接口创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
