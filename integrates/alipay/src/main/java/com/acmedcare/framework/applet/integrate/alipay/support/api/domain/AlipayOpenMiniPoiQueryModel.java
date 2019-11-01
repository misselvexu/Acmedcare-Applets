package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序查询POI信息
 *
 * @author auto create
 * @since 1.0, 2018-12-29 16:33:02
 */
public class AlipayOpenMiniPoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4733286145288754859L;

	/**
	 * 页码，起始页码为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页大小，默认为10
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
