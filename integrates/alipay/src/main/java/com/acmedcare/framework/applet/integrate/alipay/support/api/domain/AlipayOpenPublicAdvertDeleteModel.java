package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 生活号广告删除询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-07 10:29:27
 */
public class AlipayOpenPublicAdvertDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3766373783367659553L;

	/**
	 * 待删除的广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public String getAdvertId() {
		return this.advertId;
	}
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

}
