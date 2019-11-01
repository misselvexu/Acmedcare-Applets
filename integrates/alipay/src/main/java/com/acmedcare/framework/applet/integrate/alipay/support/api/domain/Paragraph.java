package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 段落
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class Paragraph extends AlipayObject {

	private static final long serialVersionUID = 3151169262823737192L;

	/**
	 * 图片列表
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;

	/**
	 * 正文介绍
	 */
	@ApiField("text")
	private String text;

	public List<Picture> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
