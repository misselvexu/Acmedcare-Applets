package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-删除标签
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:56:30
 */
public class AlipayOpenPublicLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8398166287995272472L;

	/**
	 * 标签id
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
