package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 合约号查询器，直接获得合约号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ArrangementNoQuerier extends AlipayObject {

	private static final long serialVersionUID = 7764572132574685178L;

	/**
	 * 合约编号列表
	 */
	@ApiListField("ar_nos")
	@ApiField("string")
	private List<String> arNos;

	public List<String> getArNos() {
		return this.arNos;
	}
	public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

}
