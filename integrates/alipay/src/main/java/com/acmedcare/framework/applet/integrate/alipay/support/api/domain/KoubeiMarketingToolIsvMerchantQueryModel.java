package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ISV查询商户列表接口
 *
 * @author auto create
 * @since 1.0, 2017-08-04 15:15:46
 */
public class KoubeiMarketingToolIsvMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6521927726815939258L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页大小
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
