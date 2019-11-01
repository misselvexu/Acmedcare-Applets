package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 验证通知
 *
 * @author auto create
 * @since 1.0, 2017-11-21 22:27:49
 */
public class AlipayOpenAppNotifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6249383353913756316L;

	/**
	 * 通知id
	 */
	@ApiField("notify_id")
	private String notifyId;

	public String getNotifyId() {
		return this.notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}

}
