package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 测试数据验证
 *
 * @author auto create
 * @since 1.0, 2019-03-13 10:52:00
 */
public class AlipayOpenDesCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8378958562786416952L;

	/**
	 * 21
	 */
	@ApiListField("des")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> des;

	/**
	 * 订单
	 */
	@ApiListField("test")
	@ApiField("boolean")
	private List<Boolean> test;

	public List<GavintestNewLeveaOne> getDes() {
		return this.des;
	}
	public void setDes(List<GavintestNewLeveaOne> des) {
		this.des = des;
	}

	public List<Boolean> getTest() {
		return this.test;
	}
	public void setTest(List<Boolean> test) {
		this.test = test;
	}

}
