package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 创意分页查询结果
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:27:30
 */
public class PageCreative extends AlipayObject {

	private static final long serialVersionUID = 5122967551568464487L;

	/**
	 * 创意详情列表
	 */
	@ApiListField("list")
	@ApiField("creative_detail")
	private List<CreativeDetail> list;

	/**
	 * 创意分页信息
	 */
	@ApiField("pagination")
	private PageInfo pagination;

	public List<CreativeDetail> getList() {
		return this.list;
	}
	public void setList(List<CreativeDetail> list) {
		this.list = list;
	}

	public PageInfo getPagination() {
		return this.pagination;
	}
	public void setPagination(PageInfo pagination) {
		this.pagination = pagination;
	}

}
