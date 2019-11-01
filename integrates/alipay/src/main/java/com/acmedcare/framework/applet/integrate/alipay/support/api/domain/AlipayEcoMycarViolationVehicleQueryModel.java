package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ISV获取用户违章车辆信息
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:42
 */
public class AlipayEcoMycarViolationVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3768953116567142374L;

	/**
	 * 用户车辆ID,支付宝系统唯一
	 */
	@ApiField("vi_id")
	private String viId;

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}
