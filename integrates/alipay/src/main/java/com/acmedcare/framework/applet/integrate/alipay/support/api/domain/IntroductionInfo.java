package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 商品详情-商家介绍数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class IntroductionInfo extends AlipayObject {

	private static final long serialVersionUID = 2296122583532394787L;

	/**
	 * 商品详情-商家介绍图片地址列表
	 */
	@ApiListField("image_urls")
	@ApiField("string")
	private List<String> imageUrls;

	/**
	 * 商品详情-商家介绍标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getImageUrls() {
		return this.imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
