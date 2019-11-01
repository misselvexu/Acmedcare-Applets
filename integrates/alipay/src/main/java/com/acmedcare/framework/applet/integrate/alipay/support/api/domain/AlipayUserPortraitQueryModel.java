package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 查询支付宝用户简要信息
 *
 * @author auto create
 * @since 1.0, 2018-11-22 16:51:57
 */
public class AlipayUserPortraitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6825373119637684675L;

	/**
	 * 1688端传递havanaId的列表过来，单次传递不超过2个
	 */
	@ApiListField("havana_id")
	@ApiField("string")
	private List<String> havanaId;

	public List<String> getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(List<String> havanaId) {
		this.havanaId = havanaId;
	}

}
