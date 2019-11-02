package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 0411预发验证
 *
 * @author auto create
 * @since 1.0, 2019-04-11 17:22:28
 */
public class AlipayOpenMiniReleaststBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7555612382445915835L;

	/**
	 * 20
	 */
	@ApiField("canshu")
	private String canshu;

	/**
	 * 测试数据
	 */
	@ApiField("fuza")
	private GavintestNewLeveaOne fuza;

	public String getCanshu() {
		return this.canshu;
	}
	public void setCanshu(String canshu) {
		this.canshu = canshu;
	}

	public GavintestNewLeveaOne getFuza() {
		return this.fuza;
	}
	public void setFuza(GavintestNewLeveaOne fuza) {
		this.fuza = fuza;
	}

}