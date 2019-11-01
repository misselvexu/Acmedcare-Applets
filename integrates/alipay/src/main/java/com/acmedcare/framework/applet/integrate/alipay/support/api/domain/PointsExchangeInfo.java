package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 积分兑换内容
 *
 * @author auto create
 * @since 1.0, 2018-05-23 20:58:14
 */
public class PointsExchangeInfo extends AlipayObject {

	private static final long serialVersionUID = 3725996181174836973L;

	/**
	 * 兑换内容的ID
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	/**
	 * 积分兑换内容的类型，比如券
	 */
	@ApiField("type")
	private String type;

	public List<String> getIds() {
		return this.ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
