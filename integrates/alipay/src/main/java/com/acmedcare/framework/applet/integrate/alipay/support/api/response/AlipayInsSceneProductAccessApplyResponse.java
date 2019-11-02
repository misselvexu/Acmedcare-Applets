package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsProduct;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.access.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-05 17:12:42
 */
public class AlipayInsSceneProductAccessApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4629968666311189567L;

	/** 
	 * true 表示可以准入， false表示不可以准入。
当准入结果为false的时候需要提示用户当前不能购买该产品
	 */
	@ApiField("is_access")
	private Boolean isAccess;

	/** 
	 * 产品信息(保险标准查询信息)
	 */
	@ApiField("product")
	private InsProduct product;

	/** 
	 * 不准入原因，该原因为统一的风控原因，用于上游日志使用，不能直接提示给用户，建议给用户的提示文案和蚂蚁PD沟通后给出。
该字段在系统异常的情况下为空
	 */
	@ApiField("reason")
	private String reason;

	public void setIsAccess(Boolean isAccess) {
		this.isAccess = isAccess;
	}
	public Boolean getIsAccess( ) {
		return this.isAccess;
	}

	public void setProduct(InsProduct product) {
		this.product = product;
	}
	public InsProduct getProduct( ) {
		return this.product;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}