package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 测试新增复杂类型
 *
 * @author auto create
 * @since 1.0, 2019-03-05 09:50:29
 */
public class Gavinmed extends AlipayObject {

	private static final long serialVersionUID = 2656992759243584745L;

	/**
	 * 复杂类型嵌入
	 */
	@ApiListField("meds")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> meds;

	/**
	 * 退换货
	 */
	@ApiField("str")
	private String str;

	public List<GavintestNewLeveaOne> getMeds() {
		return this.meds;
	}
	public void setMeds(List<GavintestNewLeveaOne> meds) {
		this.meds = meds;
	}

	public String getStr() {
		return this.str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
