package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 口碑客券的使用说明
 *
 * @author auto create
 * @since 1.0, 2017-02-20 21:18:14
 */
public class KbadvertVoucherManual extends AlipayObject {

	private static final long serialVersionUID = 2219774158439447559L;

	/**
	 * 说明
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
