package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 健身信息映射
 *
 * @author auto create
 * @since 1.0, 2019-07-12 10:27:32
 */
public class ExerciseUserMappingDTO extends AlipayObject {

	private static final long serialVersionUID = 7623388699594926257L;

	/**
	 * 健身用户id
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
